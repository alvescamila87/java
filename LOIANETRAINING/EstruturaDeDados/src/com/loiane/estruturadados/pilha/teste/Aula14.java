package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula14 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 1; i <= 15 ; i++) {
            pilha.empilhar(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
