package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula21 {

    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();

        System.out.println(fila.espiar()); //null

        fila.enfileira("C");
        fila.enfileira("B");
        fila.enfileira("A");

        System.out.println(fila.espiar()); // C

        System.out.println(fila);
    }
}
