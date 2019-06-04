package com.company;

abstract class Eletronico extends Produto { //classe abstrata//

    private String cor;
    private String tamanho;
    private int numeroDeSerie;
    private int som;

    private boolean ligado = false;

/*    int tamanhoNumeroDeSerie = 100;
    int array[] = new int[tamanhoNumeroDeSerie];

    public Eletronico() {
        for (int i = 0; i <tamanhoNumeroDeSerie; i++) array[i] = i + 1;
    }
    public int next(){
        if (tamanhoNumeroDeSerie == 0) throw new RuntimeException("Não a mais numeros");
        // amarzena em x um numero de  0 a tamanhoNumeroDeSerie
        int x = (int)(Math.random() * tamanhoNumeroDeSerie);
        // grava o resultado a retornar
        int numeroDeSerie = array[x];
        // diminui o array e substitui o elemento sorteado
        array[x] = array[--tamanhoNumeroDeSerie];
        return numeroDeSerie;
    } */

    public Eletronico() {} //construtor vazio//

    public Eletronico (String tipo, String fabricante, float preco, String cor, String tamanho, int numeroDeSerie) { //construtor base de eletronicos//
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
