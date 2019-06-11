package com.company;
import java.util.Scanner;

public class Main {
    private static Estoque estoque = new Estoque();
    private static Carrinho carrinho = new Carrinho();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
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
                carrinho.RemoverProduto(carrinho.getItem());
            } else if (opcao.equals("4")) {
                carrinho.LimparCarrinho();
            } else if (opcao.equals("5")) {
                carrinho.FinalizarPedido();
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

    private static void ComprarProduto() {
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            input.nextLine();
            return;
        }
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
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Produtos Disponíveis");
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
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        Smartphone smartphoneSelecionado = null;
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Smarphones");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < estoque.getSmartphones().size(); i++) {
                Smartphone smartphone = estoque.getSmartphones().get(i);

                {
                    smartphone.ExibirInformacoes("Smarphone [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");

            smartphoneSelecionado = estoque.getSmartphones().get(Integer.parseInt(input.nextLine()));


        } while (smartphoneSelecionado.getPhoneSelecionado() == true);

        carrinho.AdicionarProduto(smartphoneSelecionado);
    }

    private static void ExibirTV() {
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        TV tvSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("TV");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < estoque.getTVs().size(); i++) {
                TV tv = estoque.getTVs().get(i);

                {
                    tv.ExibirInformacoes("TV [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            tvSelecionado = estoque.getTVs().get(Integer.parseInt(input.nextLine()));

        } while (tvSelecionado.getTvSelecionado() == true);

        carrinho.AdicionarProduto(tvSelecionado);
    }

    private static void ExibirSom() {
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        Som somSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Som");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < estoque.getSons().size(); i++) {
                Som som = estoque.getSons().get(i);

                {
                    som.ExibirInformacoes("Som [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            somSelecionado = estoque.getSons().get(Integer.parseInt(input.nextLine()));

        } while (somSelecionado.getSomSelecionado() == true);

        carrinho.AdicionarProduto(somSelecionado);
    }

    private static void ExibirFeijao() {
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        Feijao feijaoSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Feijão");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < estoque.getFeijoes().size(); i++) {
                Feijao feijao = estoque.getFeijoes().get(i);

                {
                    feijao.ExibirInformacoes("Feijão [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            feijaoSelecionado = estoque.getFeijoes().get(Integer.parseInt(input.nextLine()));

        } while (feijaoSelecionado.getFeijaoSelecionado() == true);

        carrinho.AdicionarProduto(feijaoSelecionado);
    }

    private static void ExibirArroz() {
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        Arroz arrozSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Arroz");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < estoque.getArroz().size(); i++) {
                Arroz arroz = estoque.getArroz().get(i);

                {
                    arroz.ExibirInformacoes("Arroz [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            arrozSelecionado = estoque.getArroz().get(Integer.parseInt(input.nextLine()));

        } while (arrozSelecionado.getArrozSelecionado() == true);

        carrinho.AdicionarProduto(arrozSelecionado);
    }

    private static void ExibirCarne() {
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        Carne carneSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Carnes");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < estoque.getCarnes().size(); i++) {
                Carne carne = estoque.getCarnes().get(i);

                {
                    carne.ExibirInformacoes("Carnes [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            carneSelecionado = estoque.getCarnes().get(Integer.parseInt(input.nextLine()));

        } while (carneSelecionado.getCarneSelecionado() == true);

        carrinho.AdicionarProduto(carneSelecionado);
    }

    private static void ExibirCremeDental() {
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        CremeDental cremeDentalSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Creme Dental");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < estoque.getCremesDentais().size(); i++) {
                CremeDental cremeDental = estoque.getCremesDentais().get(i);

                {
                    cremeDental.ExibirInformacoes("Creme Dental [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            cremeDentalSelecionado = estoque.getCremesDentais().get(Integer.parseInt(input.nextLine()));

        } while (cremeDentalSelecionado.getCremeDentalSelecionado() == true);

        carrinho.AdicionarProduto(cremeDentalSelecionado);
    }

    private static void ExibirShampoo() {
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        Shampoo shampooSelecionado;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Shampoo");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < estoque.getShampoos().size(); i++) {
                Shampoo shampoo = estoque.getShampoos().get(i);

                {
                    shampoo.ExibirInformacoes("Shampoo [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            shampooSelecionado = estoque.getShampoos().get(Integer.parseInt(input.nextLine()));

        } while (shampooSelecionado.getShampooSelecionado() == true);

        carrinho.AdicionarProduto(shampooSelecionado);
    }

    private static void ExibirSabonete() {
        if (carrinho.getProdutos().size() >= 10) {
            System.out.println("Quantidade máxima de produtos excedido! Aperte 'V' para voltar");
            return;
        }
        Sabonete saboneteSelecionado = null;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Sabonete");
            System.out.println("--------------------------------------------------");

            for (int i = 0; i < estoque.getSabonetes().size(); i++) {
                Sabonete sabonete = estoque.getSabonetes().get(i);

                {
                    sabonete.ExibirInformacoes("Sabonete [" + i + "]");
                }
            }

            System.out.print("\nInforme a opção desejada: ");
            saboneteSelecionado = estoque.getSabonetes().get(Integer.parseInt(input.nextLine()));

        } while (saboneteSelecionado.getSaboneteSelecionado() == true);

        carrinho.AdicionarProduto(saboneteSelecionado);
    }

    private static void ExibirCarrinho() {
        System.out.println("--------------------------------------------------");
        System.out.println("Produtos no Carrinho");
        System.out.println("--------------------------------------------------");

        for (Produto produto : carrinho.getProdutos()) {
            produto.ExibirInformacoes();
        }
        float valorTotal = 0;

        for (Produto valor : carrinho.getProdutos()) {
            valorTotal += valor.getPreco();
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Valor total R$: " + String.format(java.util.Locale.US, "%.2f", valorTotal));
        System.out.println("--------------------------------------------------");
    }

    }

