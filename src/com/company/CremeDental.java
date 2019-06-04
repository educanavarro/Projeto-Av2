package com.company;

public class CremeDental extends Higiene {

    private boolean cremeDentalSelecionado = false;

    public CremeDental (){} //construtor vazio//

    public CremeDental  (String tipo, String fabricante, float preco, String pesoLiquido, int codigoDeBarra){ //construtor herdado de higiene//
        super(tipo, fabricante, preco, pesoLiquido, codigoDeBarra);}

    public void ExibirInformacoes() {
        ExibirInformacoes("Creme Dental");
    }

    public void ExibirInformacoes(String cabecalho) {
        System.out.println("--------------------------------------------------");
        System.out.println(cabecalho);
        System.out.println("--------------------------------------------------");
        System.out.println("Fabricante: " + this.getFabricante());
        System.out.println("Peso Liquido: " + this.getPesoLiquido());
        System.out.println("Preço: R$ " + this.getPreco());
    }

    public boolean getCremeDentalSelecionado() {
        return cremeDentalSelecionado;
    }
    public void setCremeDentalSelecionado(boolean cremeDentalSelecionado) {
        this.cremeDentalSelecionado = cremeDentalSelecionado;
    }
}
