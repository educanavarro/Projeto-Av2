package com.company;

abstract class Higiene extends Produto{ //classe abstrata//
    private String nome;
    private String pesoLiquido;
    private int codigoDeBarra;

    private boolean higieneSelecionado = false;

    public Higiene(){} //construtor vazio//

    public Higiene (String tipo, String fabricante, float preco, String pesoLiquido, int codigoDeBarra){ //construtor base de higiene//
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

    public boolean getHigieneSelecionado() {
        return higieneSelecionado;
    }
    public void setHigieneSelecionado(boolean higieneSelecionado) {
        this.higieneSelecionado = higieneSelecionado;
    }
}
