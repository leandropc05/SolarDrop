package com.echotech.solardrop.service;

import org.springframework.stereotype.Service;
import com.echotech.solardrop.model.Bomba;
import com.echotech.solardrop.model.SensorUmidade;

@Service 
public class IrrigacaoService {
  private Bomba bomba;
  
  public IrrigacaoService(Bomba bomba){
    this.bomba = bomba;
  }

  public void verificarIrrigacao(SensorUmidade sensor){
    if (sensor.precisaIrrigar() == true) {
      bomba.ligar(); 
    } else {
      bomba.desligar();
    }
  }

  public boolean estaBombaLigada(){
    return bomba.estaLigada();
  }
  
}
