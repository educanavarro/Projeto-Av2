package com.company;

public class Smartphone extends Eletronico {
    private String chamada;

    private boolean phoneSelecionado = false;

    public Smartphone() {}

    public Smartphone (String tipo, String fabricante, float preco, String cor, String tamanho, int numeroDeSerie) {
        super(tipo, fabricante, preco, cor, tamanho, numeroDeSerie);
    }

    public void ExibirInformacoes() {
        ExibirInformacoes("Smartphones");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Preço: R$ " + this.getPreco());
    }

    public String getChamada() {
        return chamada;
    }
    public void setChamada(String chamada) {
        this.chamada = chamada;
    }

    public boolean getPhoneSelecionado() {
        return phoneSelecionado;
    }
    public void setPhoneSelecionado(boolean phoneSelecionado) {
        this.phoneSelecionado = phoneSelecionado;
    }

}


