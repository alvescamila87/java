package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula17 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilhar(1);
        pilha.empilhar(10);
        pilha.empilhar(13);

        System.out.println(pilha);
        System.out.println(pilha.tamanho());

        //pilha.desempilha();
        System.out.println("Elemento desempilhado: " + pilha.desempilha());

        System.out.println(pilha);
        System.out.println(pilha.tamanho());


    }
}
