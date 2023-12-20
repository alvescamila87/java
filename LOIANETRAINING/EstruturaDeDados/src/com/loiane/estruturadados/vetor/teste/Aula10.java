package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;
import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10 {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        vetor.adiciona("3");
        vetor.adiciona(4);
        vetor.adiciona(5);

        System.out.println("Tamanho = " + vetor.tamanho());

        System.out.println(vetor);

    }
}
