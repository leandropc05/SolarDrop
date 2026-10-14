# SOLARDROP

**Backend - Spring Boot**

## Sobre o projeto

O SolarDrop é um projeto acadêmico que tem como objetivo desenvolver um sistema de irrigação automatizada utilizando energia solar e previsão meteorológica.

A proposta é monitorar a umidade do solo e utilizar informações sobre a possibilidade de chuva para auxiliar na decisão de quando irrigar as plantas, evitando o desperdício de água e aproveitando melhor os recursos energéticos.

Atualmente, o projeto está em fase de desenvolvimento e funciona por meio de simulações no backend, sem sensores ou bomba físicos.

## Tecnologias utilizadas

- Java
- Spring Boot
- API Open-Meteo para consulta da previsão meteorológica

## Funcionalidades desenvolvidas

- Simulação da leitura de umidade do solo.
- Verificação da necessidade de irrigação.
- Controle simulado de uma bomba de irrigação.
- Consulta da probabilidade de chuva por meio de uma API meteorológica.

**Importante:** a consulta meteorológica já funciona, mas ainda será integrada à lógica de decisão da irrigação.

## Como executar

1. Abrir o projeto na IDE.
2. Iniciar a classe `SolardropApplication`.
3. Esperar o Spring Boot iniciar.
4. Abrir o navegador e acessar os endpoints abaixo.

## Endpoints

**GET /solardrop**

http://localhost:8080/solardrop

Verifica se o sistema está funcionando.

**GET /sensor**

http://localhost:8080/sensor?umidade=25

Envia um valor de umidade para simular a leitura do sensor.

Exemplo: com umidade de 25%, o sistema identifica a necessidade de irrigação e liga a bomba simulada.

Também é possível testar com:

http://localhost:8080/sensor?umidade=50

Nesse caso, a irrigação não será necessária.

**GET /clima**

http://localhost:8080/clima

Consulta a probabilidade de chuva por meio da API Open-Meteo.

## Próximas etapas

- Integrar a previsão meteorológica à decisão de irrigação.
- Desenvolver uma interface para acompanhar os dados.
- Avaliar o monitoramento da energia solar e da bateria.
- Estudar a integração com ESP32 e sensores físicos.

## Equipe

EchoTech
Projeto acadêmico desenvolvido na FACENS.
