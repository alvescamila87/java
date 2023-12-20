package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(10);

        vetor.adicionar("elemento 1"); //0
        vetor.adicionar("elemento 2"); //1
        vetor.adicionar("elemento 3"); //2

        System.out.println(vetor.busca("elemento 2")); //1 retornou a posição
        System.out.println(vetor.busca("Elemento 2")); //-1: elemento não existe
    }
}
