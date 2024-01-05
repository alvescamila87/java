package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class TesteEx02L {

    public static void main(String[] args) {

        Pilha<Integer> par = new Pilha<>();
        Pilha<Integer> impar = new Pilha<>();

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.printf("Informe o %sº número inteiro: ", i + 1);
            int num = entrada.nextInt();


            if (num == 0) {

                // par
                Integer desempilhado = par.desempilha();

                if(desempilhado == null) {
                    System.out.println("Pilha vazia!");
                } else {
                    System.out.println("ZERO! Desempilhando da pilha par: " + desempilhado);
                }

                // ímpar
                desempilhado = impar.desempilha();

                if(desempilhado == null) {
                    System.out.println("Pilha vazia!");
                } else {
                    System.out.println("ZERO! Desempilhando da pilha ímpar: " + desempilhado);
                }


            } else if(num % 2 == 0) {
                System.out.println("PAR Empilhando par na pilha par: " + num);
                par.empilhar(num);
            } else {
                System.out.println("ÍMPAR Empilhando ímpar na pilha ímpar: " + num);
                impar.empilhar(num);
            }

        }
        System.out.println("Desempilhando todos os números da pilha par");

        while(!par.estaVazia()) {
            System.out.println("Desempilhando da pilha par: " + par.desempilha());
        }

        System.out.println("Desempilhando todos os números da pilha par");

        while(!impar.estaVazia()) {
            System.out.println("Desempilhando da pilha ímpar: " + impar.desempilha());
        }


    }
}
