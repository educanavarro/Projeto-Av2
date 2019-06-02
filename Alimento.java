package com.company;

public class Alimento extends Produto {
    private float peso;
    private int codigoDeBarra;

    public Alimento (String tipo, String fabricante, float preco, float peso, int codigoDeBarra){
        super(tipo, fabricante, preco);
        this.peso = peso;
        this.codigoDeBarra = codigoDeBarra;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCodigoDeBarra() {
        return codigoDeBarra;
    }

    public void setCodigoDeBarra(int codigoDeBarra) {
        this.codigoDeBarra = codigoDeBarra;
    }

}
