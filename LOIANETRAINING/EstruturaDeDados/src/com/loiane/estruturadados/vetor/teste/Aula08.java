package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula08 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B"); //0
        vetor.adiciona("C"); //1
        vetor.adiciona("E"); //2
        vetor.adiciona("F");
        vetor.adiciona("G");

        System.out.println(vetor);

    }
}
