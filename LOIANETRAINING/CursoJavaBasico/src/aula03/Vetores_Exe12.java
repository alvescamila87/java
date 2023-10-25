package aula03;

import java.util.Scanner;

public class Vetores_Exe12 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %sº valor inteiro: ", i);
            vetorA[i] = entrada.nextInt();

            soma = soma + vetorA[i];

        }
        System.out.println("A soma de elementos pares do vetor: " + soma);

    }
}
