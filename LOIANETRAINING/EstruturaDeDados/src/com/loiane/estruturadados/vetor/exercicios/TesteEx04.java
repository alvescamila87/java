package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

public class TesteEx04 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("C");
        lista.adiciona("E");

        System.out.println(lista);

        System.out.println(lista.obtem(2));
        System.out.println(lista.obtem(0));

    }
}
