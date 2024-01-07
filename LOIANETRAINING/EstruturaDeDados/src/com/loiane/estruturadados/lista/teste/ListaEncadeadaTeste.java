package com.loiane.estruturadados.lista.teste;

import com.loiane.estruturadados.lista.ListaEncadeada;

/**
 * ListaEncadeadaTeste
 */
public class ListaEncadeadaTeste {

    public static void main(String[] args) {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adiciona(1);

        System.out.println(lista);
    }
}