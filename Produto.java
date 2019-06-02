package com.company;

public class Produto {
    private String tipo;
    private String fabricante;
    private float preco;

    public Produto() {
    }

    public Produto (String tipo, String fabricante, float preco) {
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}