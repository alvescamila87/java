package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Vetores_Exe11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        int[] vetorA = new int[10];
        int contadorPares = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %sº valor inteiro: ", i);
            vetorA[i] = entrada.nextInt();

            if (vetorA[i] % 2 == 0) {
                System.out.println(vetorA[i]);
                contadorPares++;
            }

        }
        System.out.println("Quantidade de elementos pares do vetor: " + contadorPares);

        }
    }


