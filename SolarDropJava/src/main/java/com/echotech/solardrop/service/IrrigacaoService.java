package com.echotech.solardrop.service;

import com.echotech.solardrop.model.Planta;

public class IrrigacaoService {
  
  public void verificarIrrigacao(Planta planta, double umidadeSensor){

    planta.setUmidadeAtual(umidadeSensor);
    System.out.println("Planta: " + planta.getNome());
    System.out.println("Umidade atual: " + planta.getUmidadeAtual() + "%");
    System.out.println("Umidade mínima: " + planta.getUmidadeMinima() + "%");

    if (planta.precisaIrrigar()) {
      System.out.println("Recomendação: IRRIGAR!");
    } else {
      System.out.println("Recomendação: NÃO IRRIGAR!");
    }

    System.out.println("--------------------");
  }
}
