package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

// https://www.slideshare.net/loianeg/exercicios-vetores-arrays-estruturas-de-dados-e-algoritmos-com-java

public class TesteEx01 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("C");

        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("C"));

    }
}
