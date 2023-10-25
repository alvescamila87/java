package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Vetores_Exe05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = entrada.nextInt();
            vetorB[i] = vetorA[i] * i;
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] );
        }
        entrada.close();

    }
}
