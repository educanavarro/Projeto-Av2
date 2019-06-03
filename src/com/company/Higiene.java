package com.company;

public class Higiene extends Produto{
    private String nome;
    private String pesoLiquido;
    private int codigoDeBarra;

    public Higiene(){}

    public Higiene (String tipo, String fabricante, float preco, String pesoLiquido, int codigoDeBarra){
        super(tipo, fabricante, preco);
        this.pesoLiquido = pesoLiquido;
        this.codigoDeBarra = codigoDeBarra;
    }

    public void ExibirInformacoes() {
        ExibirInformacoes("Higiene");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Peso Liquido: " + this.getPesoLiquido());
        System.out.println("Preço: R$ " + this.getPreco());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(String pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }
}
