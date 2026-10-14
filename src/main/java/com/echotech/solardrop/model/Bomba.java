package com.echotech.solardrop.model;

import org.springframework.stereotype.Component;

@Component 
public class Bomba {
  private boolean ligada = false;

  public void ligar(){
    ligada = true;
  }

  public void desligar(){
    ligada = false;
  }

  public boolean estaLigada(){
    return ligada;
  }
}
