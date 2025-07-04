package br.com.alura.screensound.principal;

import br.com.alura.screensound.model.Artista;
import br.com.alura.screensound.model.Musica;
import br.com.alura.screensound.model.TipoArtista;
import br.com.alura.screensound.repository.ArtistaRepository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {

    private final ArtistaRepository repositorio;

    private Scanner leitura = new Scanner(System.in);

    public Principal(ArtistaRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu() {
        var opcao = -1;

        while (opcao != 9) {
            var menu = """
                    *** Screen Sound Músicas ***
                    
                    1- Cadastrar artistas
                    2- Cadastrar músicas
                    3- Listar músicas
                    4- Buscar músicas por artistas
                    5- Pesquisar dados sobre um artista
                    
                    9 - Sair
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicasPorArtista();
                    break;
                case 5:
                    pesquisarDadosDoArtista();
                    break;
                case 9:
                    System.out.println("Encerrando a aplicação!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private void pesquisarDadosDoArtista() {
        System.out.println("Pesquisar dados sobre qual Artista ? ");
        var nome = leitura.nextLine();
        var resposta = br.com.alura.screenmatch.service.ConsultaGeminiAI.obterInformacao(nome);
        System.out.println(resposta);
    }

    private void buscarMusicasPorArtista() {
        System.out.println("Buscar Músicas de qual Artista ? ");
        var nome = leitura.nextLine();
        List<Musica> musicas = repositorio.buscaMusicasPorArtista(nome);
        musicas.forEach(System.out::println);
    }

    private void listarMusicas() {
        List<Artista> artistas = repositorio.findAll();
        artistas.forEach(a -> a.getMusicas().forEach(System.out::println));

    }

    private void cadastrarMusicas() {
        var cadastrarNovo = "S";
        var repeteArtista = "S";

        while (cadastrarNovo.equalsIgnoreCase("s")) {
            System.out.println("Cadastrar Música de qual Artista? ");
            var nome = leitura.nextLine();
            Optional<Artista> artista = repositorio.findByNomeContainingIgnoreCase(nome);
            if (artista.isPresent()) {
                while (repeteArtista.equalsIgnoreCase("s")) {
                    System.out.println("Informe o Título da Música: ");
                    var nomeMusica = leitura.nextLine();
                    Musica musica = new Musica(nomeMusica);
                    musica.setArtista(artista.get());
                    artista.get().getMusicas().add(musica);
                    repositorio.save(artista.get());

                    System.out.println("Deseja cadastrar nova Música para " + nome + " ? (S/N)");
                    repeteArtista = leitura.nextLine();
                }
                cadastrarNovo = "n";
            } else {
                System.out.println("Artista não encontrado !!!");
                cadastrarNovo = "n";
            }
        }
    }

    private void cadastrarArtistas() {
        var cadastrarNovo = "S";

        while (cadastrarNovo.equalsIgnoreCase("s")) {
            System.out.println("Informe o nome do(a) Artista: ");
            var nome = leitura.nextLine();

            System.out.println("Informe o tipo: (solo, dupla ou banda):");
            var tipo = leitura.nextLine();
            TipoArtista tipoArtista = TipoArtista.valueOf(tipo.toUpperCase());
            Artista artista = new Artista(nome, tipoArtista);
            repositorio.save(artista);

            System.out.println("Deseja novo(a) Artista? (S/N) ");
            cadastrarNovo = leitura.nextLine();
        }
    }
}


