package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adiciona("elemento 1"); //0
        vetor.adiciona("elemento 2"); //1
        vetor.adiciona("elemento 3"); //2

        System.out.println(vetor.busca(15)); // Illegal argument exception
        System.out.println(vetor.busca(-1)); // Illegal argument exception
        System.out.println(vetor.busca(2)); // Illegal argument exception


    }
}
