package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Vetores_Exe10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %sº valor inteiro: ", i);
            vetorA[i] = entrada.nextInt();
            vetorB[i] = vetorA[i] % 2;
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i]);
        }
    }
}
