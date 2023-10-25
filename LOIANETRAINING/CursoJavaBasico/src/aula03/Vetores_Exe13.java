package aula03;

import java.util.Scanner;

public class Vetores_Exe13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[10];
        int somaMultiplos5 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %sº valor inteiro: ", i);
            vetorA[i] = entrada.nextInt();

            if (vetorA[i] % 5 == 0) {
                somaMultiplos5 = somaMultiplos5 + vetorA[i];
            }


        }
        System.out.println("A soma de elementos múltiplos de 5 do vetor: " + somaMultiplos5);

    }
}
