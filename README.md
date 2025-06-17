# Índice 

* [Apresentação](#Apresentação)
* [Descrição do Projeto](#Descrição)
* [Status do Projeto](#Status)
* [Objetivos do Projeto](#Objetivos)
* [Funcionalidades e Demonstração da Aplicação](#Funcionalidades)
* [Cadastrando seus Amigos](#Cadastrando)
* [Desenvolvimento](#Desenvolvimento)
* [Tecnologias utilizadas](#Tecnologias)
* [Licença](#Licença)
* [Conclusão](#Conclusão)


# Apresentação
![Apresentação da Tela/Menu](assets/Menu.jpg)
<p></p>
<p>Projeto JAVA com interação através do Terminal da Ferramenta (neste caso IntelliJ.</p>
<p></p>



# Descrição
<p>Implementar uma aplicação para armazenar dados de artistas e músicas preferidos em um banco de dados relacional (neste nosso exemplo, Postgre local) podendo buscar informações por artistas e consultar dados sobre os mesmos através de integração com a API do GeminiAI.</p>
<p>- Desenvolvida uma classe Artista, com os dados para representar o mesmo;</p>
<p>- Contemplando a implementação de *enum*, para definir o tipo do artista (solo, dupla ou banda);</p>
<p>- Desenvolvida uma classe Músicas, com os dados correspondentes e vínculo com o Artista correspondente;</p>
<p>- O projeto foi iniciado através do site do [Spring Initializr](https://start.spring.io/), onde foi possível adicionar as dependências do Spring Data JPA e do PostgreSQL;</p>
<p>- A dependência do GeminiAI foi adicionada manualmente;</p>
<p>- As configurações de Caminho de Banco de Dados, Usuário e Senha de acesso ao GeminiAI foram configuradas através de Variáveis de Ambiente;</p>
<p>- Na classe principal foi elaborado um menu, com algumas opções (ver imagem abaixo), como: cadastrar artista, cadastrar música, pesquisar músicar por artistas, etc;</p>
<p></p>

# Objetivos
<p>O objetivo deste projeto foi a prática na modelagem de classes e relacionamentos utilizando o Spring Data JPA.</p>
<p>- Com destaque para a implementação de funções para uma relação adequada entre Artista e Música, visto que um artista pode estar associado a mais de uma música;</p>
<p>- Uma música só deve ser salva no banco de dados, caso o Artista tenha sido previamente cadastrado;</p>
<p>- Foram criados controles para cadastrar mais de uma música para um(a) mesmo(a) Artista, sem a necessidade de redigitação do nome do(a) mesmo(a);</p>
<p>- Criados métodos utilizado *derived queries* e *JPQL* para verificar se o artista já está cadastrado e também buscar músicas por um determinado artista;</p>
<p>- Criação de integração com a API do Inteligência Artificial (neste caso GeminiAI) para buscar informações sobre um determinado artista, independentemente de existir seu cadastro.</p>
<p></p>

# Status
<p>Este projeto encontra-se CONCLUÍDO, tomando como base as orientações fornecidas através dos cards via Trello, tendo sido utilizada a ferramenta IntelliJ para seu desenvolvimento.</p>
<p>Algumas melhorias podem ser aplicadas, aumentando as possibilidades de cadastros e outras consultas via API de Inteligência Artificial. </p>
<p></p>

# Funcionalidades
<p>Esta ferramenta (através deste projeto) possui interação com o usuário através da tela do terminal, onde destacamos um Menu contendo algumas opções.</p>
<p></p>

# Desenvolvimento 🔨
<p>Ferramenta desenvolvida por Reinaldo Rodrigues (https://github.com/rrodrigues-ftc).</p>
<p>Apaixonado por tecnologia e entusiasta da automação de processos, e que adora desafios. E este foi um dos bons!</p>
<p></p>

# Tecnologias
<p>No repositório serão encontrados arquivos correspondentes a JAVA.</p>
<p>A utilização/integração do GeminiAI exige a utilização de uma API-KEY exclusiva. Acesse o site https://cloud.google.com/application-integration/docs/build-integrations-gemini?hl=pt-br e realize seu cadastro.</p>
<p></p>

# Licença
![Licença 2](assets/one.jpg)
![Licença 1](assets/AluraOracle.jpg)
![Licença 3](assets/GeminiAI.jpg)


# Conclusão
<p>Jun/2025</p> 
