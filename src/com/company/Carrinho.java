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
        System.out.println("O produto, "+ produto.getTipo() + " " + produto.getFabricante() +" foi adicionado ao carrinho");
        System.out.println("--------------------------------------------------");
    }

    public void RemoverProduto(int item) {
        this.produtos.remove(item);
        this.item = item;
        System.out.println("--------------------------------------------------");
        System.out.println("Produtos no Carrinho");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < produtos.size() ; i++) {
            Produto produto = getProdutos().get(i);

            {
                produto.ExibirInformacoes("Produto [" + i + "]");
            }

        }
        System.out.println("--------------------------------------------------");
        System.out.println("Digite qual produto deseja remover: ");
        System.out.println("--------------------------------------------------");
            input.nextLine();
        System.out.println("--------------------------------------------------");
        System.out.println("O produto, "+ getProdutos().size() +" foi removido do carrinho");
        System.out.println("--------------------------------------------------");
        }

    public void LimparCarrinho() {
        this.produtos.clear();
        System.out.println("--------------------------------------------------");
        System.out.println("Todos os produtos foram removido");
    }

    public void FinalizarPedido() {
        float valorTotal = 0;

        for (Produto valor : produtos) {
            valorTotal += valor.getPreco();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Valor total R$: " + valorTotal);
        System.out.println("--------------------------------------------------");
        System.exit(0);
    }

    public int getItem() {
        return item;
    }
    public void setItem(int item) {
        this.item = item;
    }


}
