package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("B"); //0
        vetor.adiciona("G"); //1
        vetor.adiciona("D"); //2
        vetor.adiciona("E");
        vetor.adiciona("F");

        System.out.println(vetor);

        vetor.remove(1);

        System.out.println(vetor);

        //busca e remove

        System.out.println("Remover o elemento E");

        int pos = vetor.busca("A");
        if(pos > -1) {
            vetor.remove(pos);
        } else {
            System.out.println("Elemento não existe no vetor!");
        }

        System.out.println(vetor);

    }
}
