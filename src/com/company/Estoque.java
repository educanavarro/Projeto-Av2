package com.company;

import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Estoque(){
        this.produtos.add(new Smartphone("Smarphone", "Sony", 2497.99f, "Branco", "146 x 72", 357509532));
        this.produtos.add(new Smartphone("Smarphone", "Apple", 2878.98f, "Dourado", "138.4 x 67.3", 350759302));
        this.produtos.add(new Smartphone("Smarphone", "Motorola", 1159.99f, "Preto", "144.3 x 73", 351070813));
        this.produtos.add(new Smartphone("Smarphone", "Asus", 1278.98f, "Vermelho", "155.4 x 75.2", 359000821));
        this.produtos.add(new Smartphone("Smarphone", "Samsung", 1539.54f, "Preto", "155.6 x 75.8", 350128700));
        this.produtos.add(new Smartphone("Smarphone", "Google", 1389.89f, "Branco", "143.8 x 69.5", 350891070));
        this.produtos.add(new Smartphone("Smarphone", "Huawei", 2078.59f, "Preto", "152.9 x 72.7", 357801733));
        this.produtos.add(new Smartphone("Smarphone", "Xiaomi", 2158.69f, "Preto", "154.9 x 74.8", 359011138));
        this.produtos.add(new Smartphone("Smarphone", "Lenovo", 1688.79f, "Preto", "156.6 x 74.", 355570378));
        this.produtos.add(new Smartphone("Smarphone", "LG", 1206.89f, "Branco", "148.9 x 71.9", 357008010));
        this.produtos.add(new TV("TV", "Sony", 1849.79f, "Preto", "63 x 97", 133839782));
        this.produtos.add(new TV("TV", "LG", 1994.39f, "Preto", "71 x 113", 133718358));
        this.produtos.add(new TV("TV", "Samsung", 1799.90f, "Preto", "63,6 x 97", 134240667));
        this.produtos.add(new TV("TV", "Toshiba", 861.89f, "Preto", "54 x 85,2", 133839782));
        this.produtos.add(new TV("TV", "Philips", 1329.78f, "Preto", "96,9 x 56,2", 133807721));
        this.produtos.add(new Som("Som", "Sony", 1650.59f, "Azul", "39 x 68", 43925375));
        this.produtos.add(new Som("Som", "LG", 2583.49f, "Preto", "65 x 45.7", 26661992));
        this.produtos.add(new Som("Som", "JBL", 1649.39f, "Preto", "25,45 x 45,85", 31772866));
        this.produtos.add(new Som("Som", "Panasonic", 861.19f, "Preto", "50 x 83", 49370784));
        this.produtos.add(new Som("Som", "Philco", 540.39f, "Preto", "28  x 31", 56603725));
        this.produtos.add(new Feijao("Feijão", "Turquesa", 3.98f, "1 KG", 531253776));
        this.produtos.add(new Feijao("Feijão", "Kicaldo", 6.99f, "1 KG", 490157009));
        this.produtos.add(new Feijao("Feijão", "Camil", 2.99f, "1 KG", 531003876));
        this.produtos.add(new Feijao("Feijão", "Urbano", 3.75f, "1 KG", 801357009));
        this.produtos.add(new Feijao("Feijão", "Namorado", 2.98f, "1 KG", 909253789));
        this.produtos.add(new Feijao("Feijão", "Máximo", 3.09f, "1 KG", 805050000));
        this.produtos.add(new Arroz("Arroz Integral", "Tio João", 4.89f, "1 KG", 107998509));
        this.produtos.add(new Arroz("Arroz Integral", "Rariz", 9.89f, "1 KG", 108007321));
        this.produtos.add(new Arroz("Arroz", "Biju", 3.98f, "1 KG", 83200982));
        this.produtos.add(new Arroz("Arroz", "Urbano", 3.79f, "1 KG", 537022509));
        this.produtos.add(new Arroz("Arroz", "Camil", 3.99f, "1 KG", 920783210));
        this.produtos.add(new Arroz("Arroz", "Chinês", 2.79f, "1 KG", 320890349));
        this.produtos.add(new Carne("Carne", "Maturatta", 19.98f, "1 KG", 503521587));
        this.produtos.add(new Carne("Carne", "Masterboi", 18.59f, "1 KG", 509070508));
        this.produtos.add(new Carne("Carne", "Seara", 18.99f, "1 KG", 670037589));
        this.produtos.add(new Carne("Carne", "1953", 89.97f, "1 KG", 308509231));
        this.produtos.add(new CremeDental("Creme Dental", "Colgate", 4.57f, "70g", 860215789));
        this.produtos.add(new CremeDental("Creme Dental", "Sorriso", 4.69f, "70g", 897008905));
        this.produtos.add(new CremeDental("Creme Dental", "Close Up", 6.79f, "70g", 903057900));
        this.produtos.add(new CremeDental("Creme Dental", "Oral-B", 6.89f, "70g", 100738512));
        this.produtos.add(new Shampoo("Shampoo", "Pantene", 9.73f, "175ml", 707094307));
        this.produtos.add(new Shampoo("Shampoo", "Palmolive", 17.97f, "200ml", 750975122));
        this.produtos.add(new Shampoo("Shampoo", "Garnier", 9.87f, "400ml", 538085123));
        this.produtos.add(new Shampoo("Shampoo", "Seda", 7.55f, "325ml", 303207290));
        this.produtos.add(new Sabonete("Sabonete", "Dove", 2.09f, "90g", 670775210));
        this.produtos.add(new Sabonete("Sabonete", "Nivea", 2.08f, "90g", 400580853));
        this.produtos.add(new Sabonete("Sabonete", "Lux", 1.99f, "90g", 33003798));
        this.produtos.add(new Sabonete("Sabonete", "Protex", 1.89f, "90g", 223791020));
    }

    public ArrayList<Smartphone> getSmartphones(){
        ArrayList<Smartphone> resultado = new ArrayList<Smartphone>();

        for (Produto produto : produtos) {
            if(produto.getClass() == Smartphone.class){
                resultado.add((Smartphone)produto);
            }
        }

        return resultado;
    }

    public ArrayList<TV> getTVs(){
        ArrayList<TV> resultado = new ArrayList<TV>();

        for (Produto produto : produtos) {
            if(produto.getClass() == TV.class){
                resultado.add((TV)produto);
            }
        }

        return resultado;
    }

    public ArrayList<Som> getSons(){
        ArrayList<Som> resultado = new ArrayList<Som>();

        for (Produto produto : produtos) {
            if(produto.getClass() == Som.class){
                resultado.add((Som)produto);
            }
        }

        return resultado;
    }

    public ArrayList<Feijao> getFeijoes(){
        ArrayList<Feijao> resultado = new ArrayList<Feijao>();

        for (Produto produto : produtos) {
            if(produto.getClass() == Feijao.class){
                resultado.add((Feijao)produto);
            }
        }

        return resultado;
    }

    public ArrayList<Arroz> getArroz(){
        ArrayList<Arroz> resultado = new ArrayList<Arroz>();

        for (Produto produto : produtos) {
            if(produto.getClass() == Arroz.class){
                resultado.add((Arroz)produto);
            }
        }

        return resultado;
    }

    public ArrayList<Carne> getCarnes(){
        ArrayList<Carne> resultado = new ArrayList<Carne>();

        for (Produto produto : produtos) {
            if(produto.getClass() == Carne.class){
                resultado.add((Carne)produto);
            }
        }

        return resultado;
    }

    public ArrayList<CremeDental> getCremesDentais(){
        ArrayList<CremeDental> resultado = new ArrayList<CremeDental>();

        for (Produto produto : produtos) {
            if(produto.getClass() == CremeDental.class){
                resultado.add((CremeDental)produto);
            }
        }

        return resultado;
    }

    public ArrayList<Shampoo> getShampoos(){
        ArrayList<Shampoo> resultado = new ArrayList<Shampoo>();

        for (Produto produto : produtos) {
            if(produto.getClass() == Shampoo.class){
                resultado.add((Shampoo)produto);
            }
        }

        return resultado;
    }

    public ArrayList<Sabonete> getSabonetes(){
        ArrayList<Sabonete> resultado = new ArrayList<Sabonete>();

        for (Produto produto : produtos) {
            if(produto.getClass() == Sabonete.class){
                resultado.add((Sabonete)produto);
            }
        }

        return resultado;
    }
}
