package com.loiane.estruturadados.lista;

import java.util.LinkedList;

public class TesteLinkedList {

    public static void main(String[] args) {

        LinkedList<String> lista = new LinkedList<>();

        // adicionar
        lista.add("C");

        System.out.println(lista);

        // adicionar como 1º elemento
        lista.addFirst("X");

        System.out.println(lista);

        // adicionar como último elemento
        lista.addLast("Z");
        System.out.println(lista);

        // adicionar com index + elemento
        lista.add(1,"M");
        System.out.println(lista);

        // remove o 1º elemento
        lista.remove();
        System.out.println(lista);

        // remove com posição
        lista.remove(1);
        System.out.println(lista);

        // remove 1º elemento
        lista.removeFirst();
        System.out.println(lista);

        lista.add("D");
        System.out.println(lista);

        lista.removeLast();
        System.out.println(lista);

        // se possui elemento ou não
        System.out.println(lista.contains("C"));
        System.out.println(lista.contains("Z"));







    }


}
