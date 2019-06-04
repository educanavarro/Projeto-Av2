package com.company;

public class TVeSom extends Eletronico {
    private String mudarCanalEstacao;

    private boolean tveSomSelecionado = false;

    public TVeSom(){}

    public TVeSom(String tipo, String fabricante, float preco, String cor, String tamanho, int numeroDeSerie) {
        super(tipo, fabricante, preco, cor, tamanho, numeroDeSerie);
    }

    public void ExibirInformacoes() {
        ExibirInformacoes("TV e Som");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Preço: R$ " + this.getPreco());
    }

    public String getMudarCanalEstacao() {
        return mudarCanalEstacao;
    }
    public void setMudarCanalEstacao(String mudarCanalEstacao) {
        this.mudarCanalEstacao = mudarCanalEstacao;
    }

    public boolean getTveSomSelecionado() {
        return tveSomSelecionado;
    }
    public void setTveSomSelecionado(boolean tveSomSelecionado) {
        this.tveSomSelecionado = tveSomSelecionado;
    }
}
