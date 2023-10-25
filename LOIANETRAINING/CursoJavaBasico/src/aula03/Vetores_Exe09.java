package aula03;

import java.util.Scanner;

public class Vetores_Exe09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[10];
        float[] vetorB = new float[vetorA.length];
        float[] vetorC = new float[vetorB.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %sº valor inteiro para A: ", i);
            vetorA[i] = entrada.nextInt();

        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("Informe o %sº valor float para B: ", i);
            vetorB[i] = entrada.nextFloat();
            vetorC[i] = vetorA[i] / vetorB[i];

        }

        // imprimir a divisão do vetor C
        for (int i = 0; i < vetorC.length; i++) {
            System.out.println(vetorC[i]);
        }
    }
}
