package com.echotech.solardrop.service;

import org.springframework.stereotype.Service;
import com.echotech.solardrop.model.SensorUmidade;

@Service 
public class SensorService {
  
  public SensorUmidade criarSensor(double umidade){
    SensorUmidade sensorUmidade = new SensorUmidade(umidade);
    return sensorUmidade;
  }
}
