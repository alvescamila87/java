package com.loiane.estruturadados.pilha.exercicios;

import java.util.Random;
import java.util.Stack;

public class Teste02 {
    public static void main(String[] args) {

        Random random = new Random();

        int numero;

        Stack<Integer> stackPar = new Stack<>();
        Stack<Integer> stackImpar = new Stack<>();

        for (int i = 0; i < 10; i++) {

            System.out.print("i: " + i);

            numero = random.nextInt(10);

            System.out.print(" Número sorteado é: " + numero + " \n");

            if(numero == 0) {

                try {
                    if (stackPar.isEmpty() || stackImpar.isEmpty()) {
                        throw new Exception();
                    }
                } catch (Exception e) {
                    System.out.println("Pilha vazia!");
                    e.getMessage();
                }

                stackPar.pop();
                System.out.println("POP -> Pilha par: " + stackPar);

                stackImpar.pop();
                System.out.println("POP -> Pilha ímpar: " + stackImpar);
            }

            if(numero % 2 == 0) {
                stackPar.push(numero);
                System.out.println("Pilha par: " + stackPar);
            } else {
                stackImpar.push(numero);
                System.out.println("Pilha ímpar: " + stackImpar);
            }


        }
        System.out.println("FIM");
        System.out.println("Pilha par: " + stackPar);
        System.out.println("Pilha ímpar: " + stackImpar);

        //Desempilhar as duas pilhas

        for (int i = 0; i < stackPar.size(); i++) {
            System.out.println("Elemento de par desempilhado: " + stackPar.pop());
        }

        for (int i = 0; i < stackPar.size(); i++) {
            System.out.println("Elemento de ímpar desempilhado: " + stackImpar.pop());
        }

    }
}
