package com.loiane.estruturadados.pilha.teste;

import com.loiane.estruturadados.pilha.Pilha;

public class Aula16 {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        System.out.println(pilha.topo());

        System.out.println(pilha); // método toString: exibe tudo o que está dentro da pilha

        pilha.empilhar(2);
        pilha.empilhar(10);
        pilha.empilhar(13);

        System.out.println(pilha.topo());

        System.out.println(pilha); // método toString: exibe tudo o que está dentro da pilha
    }
}
