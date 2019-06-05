package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static ArrayList<Carrinho> carrinho = new ArrayList<>();
    private static ArrayList<Smartphone> smartPhones = new ArrayList<>();
    private static ArrayList<TV> tvs = new ArrayList<>();
    private static ArrayList<Som> soms = new ArrayList<>();
    private static ArrayList<Feijao> feijoes = new ArrayList<>();
    private static ArrayList<Carne> carnes = new ArrayList<>();
    private static ArrayList<Arroz> arrozs = new ArrayList<>();
    private static ArrayList<CremeDental> cremeDentals = new ArrayList<>();
    private static ArrayList<Shampoo> shampoos = new ArrayList<>();
    private static ArrayList<Sabonete> sabonetes = new ArrayList<>();
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
                RemoverProduto();
            } else if (opcao.equals("4")) {
                LimparCarrinho();
            } else if (opcao.equals("5")) {
                FinalizarPedido();
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
        System.out.println();
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
        tvs.add(new TV("TV", "Sony", 1849.99f, "Preto", "63 x 97", 133839782));
        tvs.add(new TV("TV", "LG", 1994.99f, "Preto", "71 x 113", 133718358));
        tvs.add(new TV("TV", "Samsung", 1799.98f, "Preto", "63,6 x 97", 134240667));
        tvs.add(new TV("TV", "Toshiba", 861.79f, "Preto", "54 x 85,2", 133839782));
        tvs.add(new TV("TV", "Philips", 1329.89f, "Preto", "96,9 x 56,2", 133807721));
        soms.add(new Som("Som", "Sony", 1650.88f, "Azul", "39 x 68", 43925375));
        soms.add(new Som("Som", "LG", 2583.98f, "Preto", "65 x 45.7", 26661992));
        soms.add(new Som("Som", "JBL", 1649.50f, "Preto", "25,45 x 45,85", 31772866));
        soms.add(new Som("Som", "Panasonic", 861.00f, "Preto", "50 x 83", 49370784));
        soms.add(new Som("Som", "Philco", 540.00f, "Preto", "28  x 31", 56603725));
        feijoes.add(new Feijao("Feijão", "Turquesa", 3.99f, "1 KG", 531253776));
        feijoes.add(new Feijao("Feijão", "Kicaldo", 6.99f, "1 KG", 490157009));
        arrozs.add(new Arroz("Arroz Integral", "Tio João", 4.75f, "1 KG", 107998509));
        arrozs.add(new Arroz("Arroz", "Biju", 3.99f, "1 KG", 100709348));
        carnes.add(new Carne("Carne", "Maturatta", 19.98f, "1 KG", 503521587));
        carnes.add(new Carne("Carne", "Masterboi", 17.98f, "1 KG", 509070508));
        cremeDentals.add(new CremeDental("Creme Dental", "Colgate", 5.39f, "70g", 860215789));
        cremeDentals.add(new CremeDental("Creme Dental", "Sorriso", 5.59f, "70g", 897008905));
        shampoos.add(new Shampoo("Shampoo", "Pantene", 9.15f, "175ml", 707094307));
        shampoos.add(new Shampoo("Shampoo", "Palmolive", 17.36f, "200ml", 750975122));
        sabonetes.add(new Sabonete("Sabonete", "Dove", 1.99f, "90g", 670775210));
        sabonetes.add(new Sabonete("Sabonete", "Nivea", 1.89f, "90g", 400580853));
    }

    private static void ComprarProduto() {
        if (produtos.size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido!");
            input.nextLine();
            return;
        }
        Carrinho listaDeCompras = new Carrinho();
        CarregarDadosIniciais();
        String opcao = "";

        do {
            ExibirMenuDeCompras();
            System.out.print("Digite a opção valida: ");
            opcao = input.nextLine();

            if (opcao.equals("1")) {
                ExibirSmarphones();
            } else if (opcao.equals("2")) {
                ExibirTV();
            } else if (opcao.equals("3")) {
                ExibirSom();
            } else if (opcao.equals("4")) {
                ExibirFeijao();
            } else if (opcao.equals("5")) {
                ExibirArroz();
            } else if (opcao.equals("6")) {
                ExibirCarne();
            } else if (opcao.equals("7")) {
                ExibirCremeDental();
            } else if (opcao.equals("8")) {
                ExibirShampoo();
            } else if (opcao.equals("9")) {
                ExibirSabonete();
            }
        } while (!opcao.toUpperCase().equals("V"));
    }


    private static void ExibirMenuDeCompras() {
        System.out.println("--------------------------------------------------");
        System.out.println("Carrinho de Compras");
        System.out.println("--------------------------------------------------");
        System.out.println("O Que Deseja comprar?");
        System.out.println("[1] - Smaphone");
        System.out.println("[2] - TV");
        System.out.println("[3] - Som");
        System.out.println("[4] - Feijão");
        System.out.println("[5] - Arroz");
        System.out.println("[6] - Carne");
        System.out.println("[7] - Creme Dental");
        System.out.println("[8] - Shampoo");
        System.out.println("[9] - Sabonete");
        System.out.println("[V] - Voltar");
        System.out.println();

    }

    private static void ExibirSmarphones() {
        Smartphone smartphoneSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Smarphones");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < smartPhones.size(); i++) {
                Smartphone smartphone = smartPhones.get(i);

                {
                    smartphone.ExibirInformacoes("Smarphone [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            smartphoneSelecionado = smartPhones.get(Integer.parseInt(input.nextLine()));

        } while (smartphoneSelecionado.getPhoneSelecionado() == true);


    }

    private static void ExibirTV() {
        TV tvSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("TV");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < tvs.size(); i++) {
                TV tv = tvs.get(i);

                {
                    tv.ExibirInformacoes("TV [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            tvSelecionado = tvs.get(Integer.parseInt(input.nextLine()));

        } while (tvSelecionado.getTvSelecionado() == true);


    }

    private static void ExibirSom() {
        Som somSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Som");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < soms.size(); i++) {
                Som som = soms.get(i);

                {
                    som.ExibirInformacoes("Som [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            somSelecionado = soms.get(Integer.parseInt(input.nextLine()));

        } while (somSelecionado.getSomSelecionado() == true);


    }

    private static void ExibirFeijao() {
        Feijao feijaoSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Feijão");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < feijoes.size(); i++) {
                Feijao feijao = feijoes.get(i);

                {
                    feijao.ExibirInformacoes("Feijão [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            feijaoSelecionado = feijoes.get(Integer.parseInt(input.nextLine()));

        } while (feijaoSelecionado.getFeijaoSelecionado() == true);


    }

    private static void ExibirArroz() {
        Arroz arrozSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Arroz");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < arrozs.size(); i++) {
                Arroz arroz = arrozs.get(i);

                {
                    arroz.ExibirInformacoes("Arroz [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            arrozSelecionado = arrozs.get(Integer.parseInt(input.nextLine()));

        } while (arrozSelecionado.getArrozSelecionado() == true);


    }

    private static void ExibirCarne() {
        Carne carneSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Carnes");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < carnes.size(); i++) {
                Carne carne = carnes.get(i);

                {
                    carne.ExibirInformacoes("Carnes [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            carneSelecionado = carnes.get(Integer.parseInt(input.nextLine()));

        } while (carneSelecionado.getCarneSelecionado() == true);


    }

    private static void ExibirCremeDental() {
        CremeDental cremeDentalSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Creme Dental");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < cremeDentals.size(); i++) {
                CremeDental cremeDental = cremeDentals.get(i);

                {
                    cremeDental.ExibirInformacoes("Creme Dental [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            cremeDentalSelecionado = cremeDentals.get(Integer.parseInt(input.nextLine()));

        } while (cremeDentalSelecionado.getCremeDentalSelecionado() == true);


    }

    private static void ExibirShampoo() {
        Shampoo shampooSelecionado;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Shampoo");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < shampoos.size(); i++) {
                Shampoo shampoo = shampoos.get(i);

                {
                    shampoo.ExibirInformacoes("Shampoo [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            shampooSelecionado = shampoos.get(Integer.parseInt(input.nextLine()));

        } while (shampooSelecionado.getShampooSelecionado() == true);


    }

    private static void ExibirSabonete() {
        Sabonete saboneteSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Sabonete");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < sabonetes.size(); i++) {
                Sabonete sabonete = sabonetes.get(i);

                {
                    sabonete.ExibirInformacoes("Sabonete [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            saboneteSelecionado = sabonetes.get(Integer.parseInt(input.nextLine()));

        } while (saboneteSelecionado.getSaboneteSelecionado() == true);


    }

    private static void ExibirCarrinho() {
        System.out.println("--------------------------------------------------");
        System.out.println("Produtos no Carrinho");
        System.out.println("--------------------------------------------------");
        for (Carrinho carrinho : carrinho) {
            carrinho.ExibirInformacoes();
        }
    }

    private static void RemoverProduto() {
    }

    private static void LimparCarrinho() {
    }

    private static void FinalizarPedido() {
    }

        }



