package com.company;

public class Alimento extends Produto {
    private String peso;
    private int codigoDeBarra;

    public Alimento(){}

    public Alimento (String tipo, String fabricante, float preco, String peso, int codigoDeBarra){
        super(tipo, fabricante, preco);
        this.peso = peso;
        this.codigoDeBarra = codigoDeBarra;
    }

    public void ExibirInformacoes() {
        ExibirInformacoes("Alimentos");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Preço: R$ " + this.getPreco());
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

}
