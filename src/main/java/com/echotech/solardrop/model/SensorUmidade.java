package com.echotech.solardrop.model;

public class SensorUmidade {
    private double umidade;

    public SensorUmidade(double umidade){
      this.umidade = umidade;
    }

    public double getUmidade(){
      return umidade;
    }

    public boolean precisaIrrigar(){
      if (umidade < 30) {
        return true;
      } else {
        return false;
      }
    }
}
