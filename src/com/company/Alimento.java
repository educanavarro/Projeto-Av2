package com.company;

public abstract class Alimento extends Produto {
    private String peso;
    private int codigoDeBarra;

    private boolean alimentoSelecionado = false;

    public Alimento(){}

    public Alimento (String tipo, String fabricante, float preco, String peso, int codigoDeBarra){
        super(tipo, fabricante, preco);
        this.peso = peso;
        this.codigoDeBarra = codigoDeBarra;
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

    public boolean getAlimentoSelecionado() {
        return alimentoSelecionado;
    }
    public void setAlimentoSelecionado(boolean alimentoSelecionado) {
        this.alimentoSelecionado = alimentoSelecionado;
    }

}
