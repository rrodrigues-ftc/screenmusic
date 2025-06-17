![thumbnail-Desafio Java]

# Desafio

Implementar uma aplicação para armazenar dados de artistas e músicas preferidos em um banco de dados relacional (neste nosso exemplo, Postgre local) podendo buscar informações por artistas e consultar dados sobre os mesmos através de integração com a API do GeminiAI.

- Desenvolvida uma classe Artista, com os dados para representar o mesmo;
- Contemplando a implementação de *enum*, para definir o tipo do artista (solo, dupla ou banda);
- Desenvolvida uma classe Músicas, com os dados correspondentes e vínculo com o Artista correspondente;
- O projeto foi iniciado através do site do [Spring Initializr](https://start.spring.io/), onde foi possível adicionar as dependências do Spring Data JPA e do PostgreSQL;
- A dependência do GeminiAI foi adicionada manualmente;
- As configurações de Caminho de Banco de Dados, Usuário e Senha de acesso ao GeminiAI foram configuradas através de Variáveis de Ambiente;
- Na classe principal foi elaborado um menu, com algumas opções (ver imagem abaixo), como: cadastrar artista, cadastrar música, pesquisar músicar por artistas, etc;



## 🔨 Objetivos do projeto

- O objetivo deste projeto foi a prática na modelagem de classes e relacionamentos utilizando o Spring Data JPA;
- Com destaque para a implementação de funções para uma relação adequada entre Artista e Música, visto que um artista pode estar associado a mais de uma música;
- Uma música só deve ser salva no banco de dados, caso o Artista tenha sido previamente cadastrado;
- Foram criados controles para cadastrar mais de uma música para um(a) mesmo(a) Artista, sem a necessidade de redigitação do nome do(a) mesmo(a);
- Criados métodos utilizado *derived queries* e *JPQL* para verificar se o artista já está cadastrado e também buscar músicas por um determinado artista;
- Criação de integração com a API do Inteligência Artificial (neste caso GeminiAI) para buscar informações sobre um determinado artista, independentemente de existir seu cadastro.


Foi um bom desafio!

