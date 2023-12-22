package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.teste.Contato;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteEx07 extends TesteEx06 {

    public static void main(String[] args) {

        // criação das variáveis
        Scanner entrada = new Scanner(System.in);

        // criar vetor com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<>(20);

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

    private static void imprimirVetor(ArrayList<Contato> lista) {
        System.out.println(lista);
    }

    private static void limparVetor(ArrayList<Contato> lista) {
        lista.clear();
        System.out.println("Todos os contatos do vetor foram excluídos com sucesso!");
    }
    private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("Tamanho do vetor é de: " + lista.size());
    }
    private static void excluirContato(Scanner entrada, ArrayList<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser removida", entrada);

        try{
            Contato contato = lista.get(pos);

            lista.remove(contato);

            System.out.println("Contato excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }

    private static void excluirPorPosicao(Scanner entrada, ArrayList<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser removida", entrada);

        try{
            lista.remove(pos);
            System.out.println("Contato excluído com sucesso!");
        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }

    private static void pesquisarContatoExiste(Scanner entrada, ArrayList<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", entrada);

        try{
            Contato contato = lista.get(pos);

            boolean existe = lista.contains(contato);

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

    private static void pesquisarUltimoIndice(Scanner entrada, ArrayList<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", entrada);

        try{
            Contato contato = lista.get(pos);

            System.out.println("Contato existente, segue dados:");

            System.out.println(contato); // chama o toString da classe Contato;

            System.out.println("Fazendo pesquisa do último índice do contato encontrado:");
            pos = lista.lastIndexOf(contato);

            System.out.println("Contato encontrado no índice: " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }
    private static void obterContato(Scanner entrada, ArrayList<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", entrada);

        try{
            Contato contato = lista.get(pos);

            System.out.println("Contato existente, segue dados:");

            System.out.println(contato); // chama o toString da classe Contato;

            System.out.println("Fazendo pesquisa do contato encontrado:");
            pos = lista.indexOf(contato);

            System.out.println("Contato encontrado na posição: " + pos);

        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }

    private static void obterContatoPosicao(Scanner entrada, ArrayList<Contato> lista) {

        int pos = leInformacaoInt("Entre com a posição a ser pesquisada", entrada);

        try{
            Contato contato = lista.get(pos);

            System.out.println("Contato existente, segue dados:");

            System.out.println(contato); // chama o toString da classe Contato;

        } catch (Exception e) {
            System.out.println("Posição inválida, contato NÃO adicionado!");
        }
    }

    private static void adicionaContatoFinal(Scanner entrada, ArrayList<Contato> lista) {

        System.out.println("------- CRIANDO CONTATO ---------");
        String nome = leInformacao("Entre com o nome do contato: ", entrada);
        String telefone = leInformacao("Entre com o telefone: ", entrada);
        String email = leInformacao("Entre com o e-mail: ", entrada);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");

        System.out.println(contato); // chama o toString da classe Contato;
    }

    private static void adicionaContatoPosicao(Scanner entrada, ArrayList<Contato> lista) {

        System.out.println("------- CRIANDO CONTATO ---------");
        String nome = leInformacao("Entre com o nome do contato: ", entrada);
        String telefone = leInformacao("Entre com o telefone: ", entrada);
        String email = leInformacao("Entre com o e-mail: ", entrada);

        Contato contato = new Contato(nome, telefone, email);

        int pos = leInformacaoInt("Entre com a posição a adicionar o contato", entrada);

        try{
            lista.add(pos, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato); // chama o toString da classe Contato;

        } catch (Exception e) {
            System.out.println("Posção inválida, contato NÃO adicionado!");
        }
    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {

        //instanciar fora de loop
        Contato contato;

        for (int i = 1; i < quantidade; i++) {

            contato = new Contato(); // reuso da variável
            contato.setNome("Contato " + i);
            contato.setTelefone("1111-111"+i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);

        }
    }
}
