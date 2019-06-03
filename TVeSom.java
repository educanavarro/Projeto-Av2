package com.company;

public class TVeSom extends Eletronico {
    private String mudarCanalEstacao;

    public TVeSom(){}

    public TVeSom(String tipo, String fabricante, float preco, String cor, String tamanho, int numeroDeSerie) {
        super(tipo, fabricante, preco, cor, tamanho, numeroDeSerie);
    }

    public String getMudarCanalEstacao() {
        return mudarCanalEstacao;
    }
    public void setMudarCanalEstacao(String mudarCanalEstacao) {
        this.mudarCanalEstacao = mudarCanalEstacao;
    }
}
