package com.company;

public class Smartphone extends Eletronico {
    private String chamada;

    public Smartphone() {}

    public Smartphone (String tipo, String fabricante, float preco, String cor, String tamanho, int numeroDeSerie) {
        super(tipo, fabricante, preco, cor, tamanho, numeroDeSerie);
    }

    public String getChamada() {
        return chamada;
    }
    public void setChamada(String chamada) {
        this.chamada = chamada;
    }
}
