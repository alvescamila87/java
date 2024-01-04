package com.loiane.estruturadados.pilha.exercicios;

// https://www.slideshare.net/loianeg/exercicios-pilhas-stacks-estruturas-de-dados-e-algoritmos-com-java

import java.util.Random;
import java.util.Stack;

public class Teste01 {

    public static void main(String[] args) {

        Random random = new Random();

        int numero;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {

            System.out.print("i: " + i);
            numero = random.nextInt(100);
            System.out.print(" número sorteado é: " + numero + "\n");

            if(numero % 2 == 0) {
                stack.push(numero);
            } else {

                if(stack.isEmpty()) {
                    System.out.println("Pilha vazia!!! Não é possível remover número.");
                } else {
                    stack.pop();
                }

            }

        }

        System.out.println("Números: " + stack);

    }
}
