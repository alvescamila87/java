package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula22 {

    public static void main(String[] args) {

        Fila<String> fila = new Fila<>();

        fila.enfileira("C");
        fila.enfileira("B");
        fila.enfileira("A");

        System.out.println(fila);

        //fila.deenfileira();
        System.out.println(fila.deenfileira());

        System.out.println(fila);

        System.out.println(fila.deenfileira());

        System.out.println(fila);
    }
}
