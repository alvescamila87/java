package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula11 {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(2);

        vetor.adiciona(1);
        vetor.adiciona("Elemento do tipo String");

        System.out.println(vetor);


    }
}
