package com.company;

public class Feijao extends Alimento {

    private boolean feijaoSelecionado = false;

    public Feijao(){}

    public Feijao (String tipo, String fabricante, float preco, String peso, int codigoDeBarra){
        super(tipo, fabricante, preco, peso, codigoDeBarra); }

    public void ExibirInformacoes() {
        ExibirInformacoes("Feijão");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Preço: R$ " + this.getPreco());
    }

    public boolean getFeijaoSelecionado() {
        return feijaoSelecionado;
    }
    public void setFeijaoSelecionado(boolean feijaoSelecionado) {
        this.feijaoSelecionado = feijaoSelecionado;
    }
}
