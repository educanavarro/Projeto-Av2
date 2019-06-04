package com.company;

public class Carne extends Alimento{

    private boolean carneSelecionado = false;

    public Carne(){} //construtor vazio//

    public Carne (String tipo, String fabricante, float preco, String peso, int codigoDeBarra){ //construtor herdado de alimentos//
        super(tipo, fabricante, preco, peso, codigoDeBarra);
    }
    public void ExibirInformacoes() {
        ExibirInformacoes("Carnes");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Preço: R$ " + this.getPreco());
    }

    public boolean getCarneSelecionado() {
        return carneSelecionado;
    }
    public void setCarneSelecionado(boolean carneSelecionado) {
        this.carneSelecionado = carneSelecionado;
    }
}
