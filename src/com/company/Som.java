package com.company;

public class Som extends Eletronico {
    private String mudarEstacao;

    private boolean somSelecionado = false;

    public Som(){}

    public Som(String tipo, String fabricante, float preco, String cor, String tamanho, int numeroDeSerie) {
        super(tipo, fabricante, preco, cor, tamanho, numeroDeSerie);
    }

    public void ExibirInformacoes() {
        ExibirInformacoes("Som");
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

    public void mudarEstacao(){
        this.getMudarEstacao();
    }


    public String getMudarEstacao() {
        return mudarEstacao;
    }
    public void setMudarEstacao(String mudarEstacao) {
        this.mudarEstacao = mudarEstacao;
    }

    public boolean getSomSelecionado() {
        return somSelecionado;
    }
    public void setSomSelecionado(boolean somSelecionado) {
        this.somSelecionado = somSelecionado;
    }
}
