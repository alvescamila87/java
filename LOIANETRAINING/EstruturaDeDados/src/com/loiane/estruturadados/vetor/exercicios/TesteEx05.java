package com.loiane.estruturadados.vetor.exercicios;

import com.loiane.estruturadados.vetor.Lista;

import java.util.ArrayList;

public class TesteEx05 {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Camila");
        arrayList.add("Princesa Isabel");
        arrayList.add("Jesus");

        System.out.println(arrayList);

        arrayList.clear();

        System.out.println("Depois do clear: " + arrayList);


        Lista<String> lista = new Lista<>(5);

        lista.adiciona("A");
        lista.adiciona("C");
        lista.adiciona("E");

        System.out.println(lista);

        lista.limpar();

        System.out.println("Depois do limpar: " + lista);

    }
}
