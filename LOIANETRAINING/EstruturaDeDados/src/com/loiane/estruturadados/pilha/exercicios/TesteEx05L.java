package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;
import com.sun.tools.javac.Main;

public class TesteEx05L {

    public static void main(String[] args) {

        // String palavra = "ADA";
        // imprimeResultado(palavra);

        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ABCCBA");
        imprimeResultado("Maria");

    }

    public static void imprimeResultado(String palavra) {
        System.out.println(palavra + " é palíndromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra) {

        Pilha<Character> pilha = new Pilha<>();

        // empilhando os caracteres
        for (int i = 0; i < palavra.length(); i++) {
            pilha.empilhar(palavra.charAt(i));
        }

        String palavraInversa = "";

        // deempilhando os caracteres e colocando na String inversa
        while(!pilha.estaVazia()) {
            palavraInversa += pilha.desempilha();
        }

        if(palavraInversa.equalsIgnoreCase(palavra)) {
            return true;
        }

        return false;

    }


}


