package aula03;

import java.util.Scanner;

// exercicios: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-19
public class Vetores_Exe01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %s � valor inteiro: ", i);
            vetorA[i] = entrada.nextInt();
            vetorB[i] = vetorA[i];
        }

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Vetor A: " + vetorA[i] + " Posi��o : " + i);
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Vetor B: " + vetorB[i] + " Posi��o : " + i);
        }
        entrada.close();

    }
}
