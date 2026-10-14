package com.echotech.solardrop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration 
public class ClimaConfig {
  
  @Bean 
  public RestClient criarRestClient(){
    return RestClient.builder().build();
  } 
}
