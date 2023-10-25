package aula03;

import java.util.Scanner;

public class Vetores_Exe02 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %s� n�mero inteiro: ", i + 1);
            vetorA[i]= entrada.nextInt();
            vetorB[i] = vetorA[i] * 2;

        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.printf("B -> pos: {%s}, valor: {%s} \n", i, vetorB[i]);
        }
        entrada.close();
    }
}
