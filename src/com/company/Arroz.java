package com.company;

public class Arroz extends Alimento {

    private boolean arrozSelecionado = false;

    public Arroz(){} //construtor vazio//

    public Arroz (String tipo, String fabricante, float preco, String peso, int codigoDeBarra){ //construtor herdado de alimentos//
        super(tipo, fabricante, preco, peso, codigoDeBarra);
    }

    public void ExibirInformacoes() {
        ExibirInformacoes("Arroz");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Preço: R$ " + this.getPreco());
    }

    public boolean getArrozSelecionado() {
        return arrozSelecionado;
    }
    public void setArrozSelecionado(boolean arrozSelecionado) {
        this.arrozSelecionado = arrozSelecionado;
    }
}
