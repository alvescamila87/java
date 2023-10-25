package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Vetores_Exe15 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[5];
        int contadorPar = 0;
        int contadorImpar = 0;
        int contadorGeral = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %sº valor inteiro: ", i);
            vetorA[i] = entrada.nextInt();

            if (vetorA[i] % 2 == 0) {
                contadorPar++;
            } else {
                contadorImpar++;
            }
            contadorGeral++;

        }
        System.out.println("Percentual de elementos pares do vetor: " + (100 * contadorPar) /contadorGeral);
        System.out.println("Percentual de elementos ímpares do vetor: " + (100 * contadorImpar)/contadorGeral);

    }
}
