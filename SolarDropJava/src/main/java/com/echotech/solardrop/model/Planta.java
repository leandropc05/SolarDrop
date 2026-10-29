package com.echotech.solardrop.model;

public class Planta {

    private String nome;
    private double umidadeAtual;
    private double umidadeMinima;

    public Planta(String nome, double umidadeAtual, double umidadeMinima) {
        this.nome = nome;
        this.umidadeAtual = umidadeAtual;
        this.umidadeMinima = umidadeMinima;
    }

    public boolean precisaIrrigar() {
        return umidadeAtual < umidadeMinima;
    }

    public String getNome() {
        return nome;
    }

    public double getUmidadeAtual() {
        return umidadeAtual;
    }

    public void setUmidadeAtual(double umidadeAtual) {
    this.umidadeAtual = umidadeAtual;
}

    public double getUmidadeMinima() {
        return umidadeMinima;
    }
}
