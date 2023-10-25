package aula04;

import java.util.Scanner;

public class Matrizes_Exe03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matrizNumeros = new int[3][3];

        for (int linha = 0; linha < matrizNumeros.length; linha++) {

            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {
                System.out.printf("Informe %sº número inteiro da %sª linha: ", coluna + 1, linha + 1);
                matrizNumeros[linha][coluna] = entrada.nextInt();

            }

        }

        // Imprimir matriz

        for (int linha = 0; linha < matrizNumeros.length; linha++) {
            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {
                System.out.print(matrizNumeros[linha][coluna] + " ");
            }
            System.out.println();
        }

        // Números pares e ímpares

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int linha = 0; linha < matrizNumeros.length; linha++) {
            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {
                if(matrizNumeros[linha][coluna] % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            }
        }
        System.out.println("Quantidade de pares na matriz: " + contadorPares);
        System.out.println("Quantidade de ímpares na matriz: " + contadorImpares);
    }
}
