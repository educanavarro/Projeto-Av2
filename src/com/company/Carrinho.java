package com.company;

public class Carrinho extends Produto{

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

}
