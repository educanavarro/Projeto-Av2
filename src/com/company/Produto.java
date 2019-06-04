package com.company;

abstract class Produto {
    private String tipo;
    private String fabricante;
    private float preco;

    public Produto() {
    } //construtor vazio//

    public Produto (String tipo, String fabricante, float preco) {
        this.tipo = tipo;
        this.fabricante = fabricante;
        this.preco = preco;
    } //construtor generico//

    public void ExibirInformacoes() {
        ExibirInformacoes("Dados dos Produtos");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Preço: R$ " + this.getPreco());
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
