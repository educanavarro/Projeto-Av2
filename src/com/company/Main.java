package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static ArrayList<Produto> carrinho = new ArrayList<>();
    private static ArrayList<Smartphone> smartPhones = new ArrayList<>();
    private static ArrayList<TVeSom> tveSom = new ArrayList<>();
    private static ArrayList<Alimento> alimentos = new ArrayList<>();
    private static ArrayList<Higiene> higienes = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        CarregarDadosIniciais();
        String opcao = "";

        do {
            ExibirMenuPrincipal();

            System.out.print("Informe a opção desejada: ");
            opcao = input.nextLine();

            if (opcao.equals("1")) {
                ComprarProduto();
            } else if (opcao.equals("2")) {
                ExibirCarrinho();
            } else if (opcao.equals("3")) {
                ExibirMenuPrincipal();
            } else if (opcao.equals("4")) {
                ExibirMenuPrincipal();
            } else if (opcao.equals("5")) {
                ExibirMenuPrincipal();
            }
        } while (!opcao.toUpperCase().equals("S"));
    }

    private static void ExibirMenuPrincipal() {
        System.out.println("--------------------------------------------------");
        System.out.println("Bem-vindo a APSMart");
        System.out.println("Digite a opção desejada:");
        System.out.println("--------------------------------------------------");
        System.out.println("[1] - Comprar Produto");
        System.out.println("[2] - Exibir Conteúdo do Carrinho");
        System.out.println("[3] - Remover Produto");
        System.out.println("[4] - Limpar Carrinho");
        System.out.println("[5] - Finalizar Pedido");
        System.out.println("[S] - Sair");
        System.out.println("");
    }

    private static void CarregarDadosIniciais() {
        smartPhones.add(new Smartphone("Smarphone", "Samsung", 1539.99f, "Preto", "155.6 x 75.8", 350128700));
        smartPhones.add(new Smartphone("Smarphone", "Sony", 2497.75f, "Branco", "146 x 72", 357509532));
        smartPhones.add(new Smartphone("Smarphone", "Asus", 1278.89f, "Vermelho", "155.4 x 75.2", 359000821));
        smartPhones.add(new Smartphone("Smarphone", "Apple", 2878.99f, "Dourado", "138.4 x 67.3", 350759302));
        smartPhones.add(new Smartphone("Smarphone", "Motorola", 1159.99f, "Preto", "144.3 x 73", 351070813));
        smartPhones.add(new Smartphone("Smarphone", "Google", 1389.59f, "Branco", "143.8 x 69.5", 350891070));
        smartPhones.add(new Smartphone("Smarphone", "Huawei", 2078.89f, "Preto", "152.9 x 72.7", 357801733));
        smartPhones.add(new Smartphone("Smarphone", "Xiaomi", 2158.99f, "Preto", "154.9 x 74.8", 359011138));
        smartPhones.add(new Smartphone("Smarphone", "Lenovo", 1688.57f, "Preto", "156.6 x 74.", 355570378));
        smartPhones.add(new Smartphone("Smarphone", "LG", 1205.99f, "Branco", "148.9 x 71.9", 357008010));
        tveSom.add(new TVeSom("TV", "Sony", 1849.99f, "Preto", "63 x 97", 133839782));
        tveSom.add(new TVeSom("TV", "LG", 1994.99f, "Preto", "71 x 113", 133718358));
        tveSom.add(new TVeSom("TV", "Samsung", 1799.98f, "Preto", "63,6 x 97", 134240667));
        tveSom.add(new TVeSom("TV", "Toshiba", 861.79f, "Preto", "54 x 85,2", 133839782));
        tveSom.add(new TVeSom("TV", "Philips", 1329.89f, "Preto", "96,9 x 56,2", 133807721));
        tveSom.add(new TVeSom("Som", "Sony", 1650.88f, "Azul", "39 x 68", 43925375));
        tveSom.add(new TVeSom("Som", "LG", 2583.98f, "Preto", "65 x 45.7", 26661992));
        tveSom.add(new TVeSom("Som", "JBL", 1649.50f, "Preto", "25,45 x 45,85", 31772866));
        tveSom.add(new TVeSom("Som", "Panasonic", 861.00f, "Preto", "50 x 83", 49370784));
        tveSom.add(new TVeSom("Som", "Philco", 540.00f, "Preto", "28  x 31", 56603725));
        alimentos.add(new Alimento("Feijão", "Turquesa", 3.99f, "1 KG", 531253776));
        alimentos.add(new Alimento("Feijão", "Kicaldo", 6.99f, "1 KG", 490157009));
        alimentos.add(new Alimento("Arroz Integral", "Tio João", 4.75f, "1 KG", 107998509));
        alimentos.add(new Alimento("Arroz", "Biju", 3.99f, "1 KG", 100709348));
        alimentos.add(new Alimento("Carne", "Maturatta", 19.98f, "1 KG", 503521587));
        alimentos.add(new Alimento("Carne", "Masterboi", 17.98f, "1 KG", 509070508));
        higienes.add(new Higiene("Creme Dental", "Colgate", 5.39f, "70g", 860215789));
        higienes.add(new Higiene("Creme Dental", "Sorriso", 5.59f, "70g", 897008905));
        higienes.add(new Higiene("Shampoo", "Pantene", 9.15f, "175ml", 707094307));
        higienes.add(new Higiene("Shampoo", "Palmolive", 17.36f, "200ml", 750975122));
        higienes.add(new Higiene("Sabonete", "Dove", 1.99f, "90g", 670775210));
        higienes.add(new Higiene("Sabonete", "Nivea", 1.89f, "90g", 400580853));
    }

    private static void ComprarProduto(){
        if (produtos.size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido!");
            input.nextLine();
            return;
        }
        Produto carrinhoDeCompras = new Produto();

        System.out.println("--------------------------------------------------");
        System.out.println("Carrinho de Compras");
        System.out.println("--------------------------------------------------");
        produtos.add(carrinhoDeCompras);
    }

    private static void ExibirCarrinho() {
        System.out.println("--------------------------------------------------");
        System.out.println("Produtos no Carrinho");
        System.out.println("--------------------------------------------------");
        for (Produto produto : carrinho) {
                produto.ExibirInformacoes();
            }
        }

}
