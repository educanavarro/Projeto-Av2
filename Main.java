package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
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
                ExibirMenuPrincipal();
            } else if (opcao.equals("2")) {
                ExibirMenuPrincipal();
            } else if (opcao.equals("3")) {
                ExibirMenuPrincipal();
            }
        } while (!opcao.toUpperCase().equals("S"));
    }

    private static void ExibirMenuPrincipal() {
        System.out.println("--------------------------------------------------");
        System.out.println("Bem-vindo a APSMart");
        System.out.println("Digite a opção desejada:");
        System.out.println("--------------------------------------------------");
        System.out.println("[1] - Carrinho");
        System.out.println("[2] - Exibir Conteúdo do Carrinho");
        System.out.println("[3] - Finalizar Pedido");
        System.out.println("[S] - Sair");
        System.out.println("");
    }

    private static void CarregarDadosIniciais() {
        smartPhones.add(new Smartphone("Smarphone", "Samsung", 1539, "Preto", "155.6 x 75.8", 350128700));
        smartPhones.add(new Smartphone("Smarphone", "Sony", 2497, "Branco", "146 x 72", 357509532));
        smartPhones.add(new Smartphone("Smarphone", "Asus", 1278, "Vermelho", "155.4 x 75.2", 359000821));
        smartPhones.add(new Smartphone("Smarphone", "Apple", 2878, "Dourado", "138.4 x 67.3", 350759302));
        smartPhones.add(new Smartphone("Smarphone", "Motorola", 1159, "Preto", "144.3 x 73", 351070813));
        smartPhones.add(new Smartphone("Smarphone", "Google", 1389, "Branco", "143.8 x 69.5", 350891070));
        smartPhones.add(new Smartphone("Smarphone", "Huawei", 2078, "Preto", "152.9 x 72.7", 357801733));
        smartPhones.add(new Smartphone("Smarphone", "Xiaomi", 2158, "Preto", "154.9 x 74.8", 359011138));
        smartPhones.add(new Smartphone("Smarphone", "Lenovo", 1688, "Preto", "156.6 x 74.", 355570378));
        smartPhones.add(new Smartphone("Smarphone", "LG", 1205, "Branco", "148.9 x 71.9", 357008010));

    }
}
