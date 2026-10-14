package com.echotech.solardrop.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;


@Service 
public class ClimaService {

  public String consultarPrevisao(){
    String resposta = restClient.get()
      .uri("https://api.open-meteo.com/v1/forecast?latitude=-23.50&longitude=-47.45&hourly=precipitation_probability&forecast_days=1")
      .retrieve()
      .body(String.class);

    ObjectMapper objectMapper = new ObjectMapper();
    
    try {
       JsonNode dados = objectMapper.readTree(resposta);
       JsonNode hourly = dados.get("hourly");
       JsonNode probabilidades = hourly.get("precipitation_probability");

       JsonNode primeiraProbabilidade = probabilidades.get(0);
       int chanceChuva = primeiraProbabilidade.asInt();

       return "Probabilidade de chuva: " + chanceChuva + "%";
       
    } catch (JacksonException e) {
      return "Erro ao interpretar a previsão do tempo.";
    }

  }

    

  private final RestClient restClient;

  public ClimaService(RestClient restClient){
    this.restClient = restClient;
  }

}
