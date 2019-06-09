package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrinho {
    private int item;
    public Scanner input = new Scanner(System.in);

    private static ArrayList<Produto> produtos = new ArrayList<>();

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    public void AdicionarProduto(Produto produto){
        this.produtos.add(produto);
        System.out.println("--------------------------------------------------");
        System.out.println("O produto, "+ 1 + " foi adicionado ao carrinho");
        System.out.println("--------------------------------------------------");
    }


    public void RemoverProduto(int item) {
        this.produtos.remove(item);
        this.item = item;
        System.out.println("--------------------------------------------------");
        System.out.println("Digite qual produto vai remover: ");
        System.out.println("--------------------------------------------------");
        input.nextLine();
    }

    public void LimparCarrinho() {
        this.produtos.clear();
    }

    public void FinalizarPedido() {
        float valorTotal = 0;

        for (Produto p : produtos) {
            valorTotal += p.getPreco();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Valor total R$: " + valorTotal);
        System.out.println("--------------------------------------------------");
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

}
