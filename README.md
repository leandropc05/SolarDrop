# SolarDrop

## Descrição do projeto

O SolarDrop é um sistema de irrigação inteligente que utiliza dados de umidade do solo para recomendar quando irrigar ou aguardar, considerando a necessidade mínima de umidade de cada planta cadastrada.

O projeto integra uma simulação de sensor de arduino pelo Wokwi, uma aplicação desenvolvida em Java e um banco de dados SQLite para armazenar as informações das plantas.

## Tecnologias utilizadas

- **Java:** lógica e processamento das recomendações de irrigação.
- **Maven:** gerenciamento do projeto e de suas dependências.
- **SQLite:** armazenamento dos dados das plantas.
- **DB Browser for SQLite:** visualização e edição do banco de dados.
- **Wokwi:** simulação do circuito arduino e envio de valores de umidade.
- **PlatformIO:** configuração e compilação do simulador.

## Estrutura do projeto

- `src/main/java/com/echotech/solardrop/`: código-fonte Java.
  - `config/`: configuração da conexão com o banco de dados.
  - `hardware/`: leitura dos valores enviados pelo Wokwi.
  - `model/`: representação dos dados das plantas.
  - `repository/`: operações de consulta e cadastro no banco de dados.
  - `service/`: lógica de recomendação de irrigação.
  - `Main.java`: ponto de entrada da aplicação.
- `simulador/`: arquivos do circuito e do programa utilizado na simulação.
- `pom.xml`: configuração do projeto Maven.

## Como executar o projeto

### Pré-requisitos

- Java e Maven configurados no computador.
- Visual Studio Code com suporte a Java.
- Dependências do projeto Maven instaladas.
- Acesso ao simulador Wokwi.
- Banco de dados SQLite configurado conforme a estrutura utilizada pelo projeto.

### Etapas de execução

1. Abra a pasta `simulador/` no Visual Studio Code com a extensão PlatformIO instalada.
2. Compile o simulador usando a opção **PlatformIO: Build**.
3. Inicie a simulação do circuito no Wokwi. A configuração utiliza a porta serial TCP `4000`.
4. Abra a pasta raiz do projeto e execute a classe `Main.java`.
5. Verifique no terminal os valores de umidade recebidos, as plantas cadastradas no SQLite e as recomendações de irrigação.

**Importante:** mantenha a simulação do Wokwi em execução enquanto o Java estiver conectado. O banco `solardrop.db` deve estar no caminho esperado pela aplicação.

## Integrantes do grupo

Mauro Henrique B. Marques
Sarah Cardoso
Leandro Prudente de Carvalho
Renato de Camargo Guerra
Gustavo Natan de Oliveira
Matheus Torres
