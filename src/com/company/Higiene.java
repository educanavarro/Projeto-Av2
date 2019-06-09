package com.company;

public abstract class Higiene extends Produto{
    private String nome;
    private String pesoLiquido;
    private int codigoDeBarra;


    public Higiene(){}

    public Higiene (String tipo, String fabricante, float preco, String pesoLiquido, int codigoDeBarra){
        super(tipo, fabricante, preco);
        this.pesoLiquido = pesoLiquido;
        this.codigoDeBarra = codigoDeBarra;
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
