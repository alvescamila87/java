package aula04;

import java.util.Scanner;

public class Matrizes_Exe03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int[][] matrizNumeros = new int[3][3];

        int contador = 0;

        for (int linha = 0; linha < matrizNumeros.length; linha++) {

            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {

                System.out.printf("Entre com o %sº valor na posição [%s,%s] da matriz: \n", coluna + 1, linha, contador);
                matrizNumeros[linha][coluna] = entrada.nextInt();

                contador++;
            }
        }

        // Imprimir matriz

        int contadorPares = 0;
        int contadorImpares = 0;

        for (int i = 0; i < matrizNumeros.length; i++) {

            for (int j = 0; j < matrizNumeros[i].length; j++) {

                System.out.print(matrizNumeros[i][j] + " ");

                // Encontrar pares e ímpares
                if(matrizNumeros[i][j] % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            }
            System.out.println();
        }
        System.out.println("Quantidade de números pares da matriz: " + contadorPares);
        System.out.println("Quantidade de números ímpares da matriz: " + contadorImpares);

        entrada.close();
    }
}
