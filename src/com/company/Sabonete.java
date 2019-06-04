package com.company;

public class Sabonete extends Higiene {

    private boolean saboneteSelecionado = false;

    public Sabonete (){}

    public Sabonete  (String tipo, String fabricante, float preco, String pesoLiquido, int codigoDeBarra){
        super(tipo, fabricante, preco, pesoLiquido, codigoDeBarra);}

    public void ExibirInformacoes() {
        ExibirInformacoes("Sabonete");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Peso Liquido: " + this.getPesoLiquido());
        System.out.println("Preço: R$ " + this.getPreco());
    }

    public boolean getSaboneteSelecionado() {
        return saboneteSelecionado;
    }
    public void setSaboneteSelecionado(boolean saboneteSelecionado) {
        this.saboneteSelecionado = saboneteSelecionado;
    }
}
