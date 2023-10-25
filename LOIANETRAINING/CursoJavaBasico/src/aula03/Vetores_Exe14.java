package aula03;

import java.util.Scanner;

public class Vetores_Exe14 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[5];
        int soma = 0;
        float media = 0;
        int contador = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %sº valor inteiro: ", i);
            vetorA[i] = entrada.nextInt();

            if (vetorA[i] % 2 != 0) {
                soma = soma + vetorA[i];
                contador++;
            }


        }
        media = soma / contador;
        System.out.println("A média de elementos ímpares do vetor: " + media);

    }
}
