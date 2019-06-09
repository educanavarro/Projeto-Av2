package com.company;

public abstract class Eletronico extends Produto {

    private String cor;
    private String tamanho;
    private int numeroDeSerie;
    private int som;

    private boolean ligado = false;

    public Eletronico() {}

    public Eletronico (String tipo, String fabricante, float preco, String cor, String tamanho, int numeroDeSerie) {
        super(tipo, fabricante, preco);
        this.cor = cor;
        this.tamanho = tamanho;
        this.numeroDeSerie = numeroDeSerie;
    }

    public void ligar(){
        ligado=true;
    }
    public void desligar(){
        if (ligado)
            ligado = true;
    }

    public String verificarStatus(){

        String statusLigado;

        if(this.ligado)
        {
            statusLigado = "ligado";
        }
        else
            statusLigado = "desligado";


        return "O aparelho está " + statusLigado;

    }

    public void aumentarSom (int aumentar){

        if(ligado == true) {
            this.som += aumentar;
            System.out.println("O aparelho está aumentando");
        }
        else
            System.out.println("O aparelho está desligado! Ligue-o primeiro para aumentar o som!");

    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }
    public void setNumeroDeSerie(int numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public int getSom() {
        return som;
    }
    public void setSom(int som) {
        this.som = som;
    }

    public boolean getLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }


}
