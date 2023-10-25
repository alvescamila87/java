package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Vetores_Exe03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %sº valor inteiro: \n", i);
            vetorA[i] = entrada.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }

        //imprimir vetor B:
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] );

        }
        entrada.close();

    }
}
