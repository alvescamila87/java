package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class TesteEx03 {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("C");
        lista.adiciona("E");

        System.out.println(lista);

        lista.remove("C");

        System.out.println(lista);

        lista.remove("E");

        System.out.println(lista);

        lista.remove("A");

        System.out.println(lista);



    }
}
