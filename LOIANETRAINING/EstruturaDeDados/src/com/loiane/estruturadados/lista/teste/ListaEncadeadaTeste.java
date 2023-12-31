package com.loiane.estruturadados.lista.teste;

import com.loiane.estruturadados.lista.ListaEncadeada;

import java.security.PublicKey;
import java.sql.SQLOutput;

/**
 * ListaEncadeadaTeste
 */
public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        //testesIniciais();

        //adicionaNoInicio();

        adicionaPorPosicao();

    }

    public static void adicionaNoInicio() {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adicionaNoInicio("C");
        lista.adicionaNoInicio("B");
        lista.adicionaNoInicio("A");

        System.out.println(lista); // A, B, C

    }

    public static void adicionaPorPosicao() {
        ListaEncadeada<String> lista = new ListaEncadeada<>();

        //lista.adiciona(-1, "D");
        lista.adiciona("C");
        lista.adiciona("M");
        lista.adiciona("L");

        //lista.adiciona(5, "G");
        lista.adiciona(0, "Z"); // Z , C , M , L

        System.out.println(lista);
        lista.adiciona(4, "X"); // Z , C , M , L, X
        lista.adiciona(3, "Y"); // Z , C , M , Y, L, X

        System.out.println(lista);
    }

    public static void testesIniciais() {

        ListaEncadeada<String> lista = new ListaEncadeada<>();

        lista.adiciona("A");

        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println(lista);

        lista.adiciona("B");
        System.out.println(lista);

        lista.adiciona("C");
        System.out.println(lista);

        // aula 27
        //lista.limpa();
        //System.out.println(lista);

        // aula 28: busca por elemento
        System.out.println("----- BUSCA POR ELEMENTO ---------");
        System.out.println(lista.busca("A"));
        System.out.println(lista.busca("B"));
        System.out.println(lista.busca("C"));
        System.out.println(lista.busca("D"));

        // aula 28: busca por posição
        System.out.println("----- BUSCA POR POSIÇÃO ---------");
        System.out.println(lista.buscaPorPosicao(0));
        System.out.println(lista.buscaPorPosicao(1));
        System.out.println(lista.buscaPorPosicao(2));
        //System.out.println(lista.buscaPorPosicao(4));
        //System.out.println(lista.buscaPorPosicao(-1));

    }
}