package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.teste.Contato;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteEx06 {

    public static void main(String[] args) {

        // criação das variáveis
        Scanner entrada = new Scanner(System.in);

        // criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<>(20);

        // criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        // criar um menu para que o uusário escolha a opção
        int opcao = 1;

        while (opcao != 0) {
            opcao = obterOpcaoMenu(entrada);

            switch (opcao) {
                case 1:
                    adicionaContatoFinal(entrada, lista);
                    break;
                case 2:
                    adicionaContatoPosicao(entrada, lista);
                    break;
                case 3:
                    obterContatoPosicao(entrada, lista);
                    break;
                case 4:
                    obterContato(entrada, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(entrada, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(entrada, lista);
                    break;
                case 7:
                    excluirPorPosicao(entrada, lista);
                    break;
                case 8:
                    excluirContato(entrada, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                    break;
                default:
            }
        }

        System.out.println("Programa finalizado!");

    }

    private static void imprimirVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }

    private static void limparVetor(Lista<Contato> lista) {
        lista.limpar();
        System.out.println("Todos os contatos do vetor foram excluídos com sucesso!");
    }
    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }
    private static void excluirContato(Scanner entrada, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser removida", entrada);

        try{
            Contato contato = lista.busca(pos);

            lista.remove(contato);

            System.out.println("Contato excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }

    private static void excluirPorPosicao(Scanner entrada, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser removida", entrada);

        try{
            lista.remove(pos);
            System.out.println("Contato excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }

    private static void pesquisarContatoExiste(Scanner entrada, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", entrada);

        try{
            Contato contato = lista.busca(pos);

            boolean existe = lista.contem(contato);

            if(existe) {
                System.out.println("Contato existente, segue dados:");
                System.out.println(contato); // chama o toString da classe Contato;
            } else {
                System.out.println("Contato NÃO existe!");
            }

        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner entrada, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", entrada);

        try{
            Contato contato = lista.busca(pos);

            System.out.println("Contato existente, segue dados:");

            System.out.println(contato); // chama o toString da classe Contato;

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.ultimoIndice(contato);

            System.out.println("Contato encontrado no índice: " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }
    private static void obterContato(Scanner entrada, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", entrada);

        try{
            Contato contato = lista.busca(pos);

            System.out.println("Contato existente, segue dados:");

            System.out.println(contato); // chama o toString da classe Contato;

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.busca(contato);

            System.out.println("Contato encontrado na posição: " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }

    private static void obterContatoPosicao(Scanner entrada, Lista<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", entrada);

        try{
            Contato contato = lista.busca(pos);

            System.out.println("Contato existente, segue dados:");

            System.out.println(contato); // chama o toString da classe Contato;

        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }

    private static void adicionaContatoFinal(Scanner entrada, Lista<Contato> lista) {

        System.out.println("------- CRIANDO CONTATO ---------");
        String nome = leInformacao("Entre com o nome do contato: ", entrada);
        String telefone = leInformacao("Entre com o telefone: ", entrada);
        String email = leInformacao("Entre com o e-mail: ", entrada);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");

        System.out.println(contato); // chama o toString da classe Contato;
    }

    private static void adicionaContatoPosicao(Scanner entrada, Lista<Contato> lista) {

        System.out.println("------- CRIANDO CONTATO ---------");
        String nome = leInformacao("Entre com o nome do contato: ", entrada);
        String telefone = leInformacao("Entre com o telefone: ", entrada);
        String email = leInformacao("Entre com o e-mail: ", entrada);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato", entrada);

        try{
            lista.adiciona(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato); // chama o toString da classe Contato;

        } catch (Exception e) {
            System.out.println("Posção inválida, contato NÃO adicionado!");
        }





    }

    private static String leInformacao(String msg, Scanner entrada) {

        System.out.println(msg);
        String entradaInfo = entrada.nextLine();

        return entradaInfo;
    }

    private static int leInformacaoInt(String msg, Scanner entrada) {

        boolean entradaValida = false;
        int num = 0;

        while(!entradaValida) {

            try {
                System.out.println(msg);
                String entradaInfo = entrada.nextLine();
                num = Integer.parseInt(entradaInfo);

                entradaValida = true;

            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente!");
            }
        }

        return num;
    }

    private static int obterOpcaoMenu(Scanner entrada) {

        boolean entradaValida = false;
        int opcao = 0;
        String entradaMenu;

        while (!entradaValida) {

            System.out.println("[1] - Adicionar contao no final do vetor");
            System.out.println("[2] - Adicionar contao em posição específica");
            System.out.println("[3] - Obtém contato da posição específica");
            System.out.println("[4] - Consulta contato");
            System.out.println("[5] - Consulta último índice do contato");
            System.out.println("[6] - Verifica se contato existe");
            System.out.println("[7] - Excluir por posição");
            System.out.println("[8] - Excluir contato");
            System.out.println("[9] - Verificar tamanho do vetor");
            System.out.println("[10] - Excluir todos os contatos do vetor");
            System.out.println("[11] - Imprimir vetor");
            System.out.println("[0] - Sair");
            System.out.println("");
            System.out.println("Digite uma das opções acima: ");

            try{
                entradaMenu = entrada.nextLine();
                opcao = Integer.parseInt(entradaMenu);

                if(opcao >= 0 && opcao <= 11) {
                    entradaValida = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, digite novamente");
            }
        }

        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {

        //instanciar fora de loop
        Contato contato;

        for (int i = 1; i < quantidade; i++) {

            contato = new Contato(); // reuso da variável
            contato.setNome("Contato " + i);
            contato.setTelefone("1111-111"+i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);

        }
    }
}
