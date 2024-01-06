package com.loiane.estruturadados.fila;

import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {

        java.util.Queue<Integer> fila = new LinkedList<>();

        fila.add(13); // enqueue
        fila.add(2);
        fila.add(10);

        System.out.println(fila); // toString()

        System.out.println(fila.peek()); // espiar

        //fila.remove(); // dequeue
        System.out.println(fila.remove()); // sempre remove da 1ª posição

        System.out.println(fila);

    }
}
