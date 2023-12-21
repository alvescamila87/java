package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class TesteEx02 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("C");
        lista.adiciona("A");

        System.out.println(lista.ultimoIndice("A"));




    }
}
