package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class TesteEx01L {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.printf("Entre com um %sº número inteiro: ", i + 1);

            int num = entrada.nextInt();

            if(num % 2 == 0) {
                System.out.println("Empilhando: " + num);
                pilha.empilhar(num);
            } else {
                Integer desempilhado = pilha.desempilha();

                if(desempilhado == null) {
                    System.out.println("Pilha está vazia");
                } else {
                    System.out.println("Número ímpar, desempilhando: " + desempilhado);
                }
            }

        }

        System.out.println("Todos os números foram lidos, desempilhando os números da pilha");

        while (!pilha.estaVazia()) {

            System.out.println("Desempilhando um elemento da pilha: " + pilha.desempilha());
        }

        System.out.println("Todos os elementos foram desempilhados!");

    }
}
