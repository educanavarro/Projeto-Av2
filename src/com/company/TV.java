package com.company;

public class TV extends Eletronico {
    private String mudarCanal;

    private boolean tvSelecionado = false;

    public TV(){}

    public TV(String tipo, String fabricante, float preco, String cor, String tamanho, int numeroDeSerie) {
        super(tipo, fabricante, preco, cor, tamanho, numeroDeSerie);
    }

    public void ExibirInformacoes() {
        ExibirInformacoes("TV");
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

    public void mudarCanal(){
        this.getMudarCanal();
    }


    public String getMudarCanal() {
        return mudarCanal;
    }
    public void setMudarCanal(String mudarCanal) {
        this.mudarCanal = mudarCanal;
    }

    public boolean getTvSelecionado() {
        return tvSelecionado;
    }
    public void setTvSelecionado(boolean tvSelecionado) {
        this.tvSelecionado = tvSelecionado;
    }
}
