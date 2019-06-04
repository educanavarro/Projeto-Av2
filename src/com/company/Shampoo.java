package com.company;

public class Shampoo extends Higiene {

    private boolean shampooSelecionado = false;

    public Shampoo (){} //construtor vazio//

    public Shampoo  (String tipo, String fabricante, float preco, String pesoLiquido, int codigoDeBarra){ //construtor herdado de higiene//
        super(tipo, fabricante, preco, pesoLiquido, codigoDeBarra);}

    public void ExibirInformacoes() {
        ExibirInformacoes("Shampoo");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Peso Liquido: " + this.getPesoLiquido());
        System.out.println("Preço: R$ " + this.getPreco());
    }

    public boolean getShampooSelecionado() {
        return shampooSelecionado;
    }
    public void setShampooSelecionado(boolean shampooSelecionado) {
        this.shampooSelecionado = shampooSelecionado;
    }
}
