package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Vetores_Exe04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] vetorA = new double[15];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {

            System.out.printf("Informe o %sº valor inteiro: ", i);
            vetorA[i] = entrada.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        // imprimir vetor B
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println(vetorB[i] );
        }
        entrada.close();

    }
}
