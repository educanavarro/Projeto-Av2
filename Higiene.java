package com.company;

public class Higiene extends Produto{
    private String nome;
    private float pesoLiquido;
    private int codigoDeBarra;

    public Higiene (String tipo, String fabricante, float preco, float pesoLiquido, int codigoDeBarra){
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

    public float getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(float pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }
}
