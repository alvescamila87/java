package aula04;

import java.util.Random;

public class Matrizes_Exe02 {

    public static void main(String[] args) {

        int[][] matrizNumeros = new int[10][10];

        Random numerosAleatorios = new Random();

        for (int i = 0; i < matrizNumeros.length; i++) {

            for (int j = 0; j < matrizNumeros[i].length; j++) {

                matrizNumeros[i][j] = numerosAleatorios.nextInt(100);
                System.out.print(matrizNumeros[i][j] + " ");
            }
            System.out.println();
        }

        // Maior e menor valor na linha 5

        int maiorNumeroL5 = Integer.MIN_VALUE;
        int menorNumeroL5 = Integer.MAX_VALUE;
        int linha = 5;

        for (int i = 0; i < matrizNumeros[linha].length; i++) {

            if(matrizNumeros[linha][i] > maiorNumeroL5) {
                maiorNumeroL5 = matrizNumeros[linha][i];
            }

            if(matrizNumeros[linha][i] < menorNumeroL5) {
                menorNumeroL5 = matrizNumeros[linha][i];
            }
        }
        System.out.println();
        System.out.println("Maior valor L5: " + maiorNumeroL5);
        System.out.println("Menor valor L5: " + menorNumeroL5);

        // Maior e menor valor na coluna 5

        int maiorNumeroC7 = Integer.MIN_VALUE;
        int menorNumeroC7 = Integer.MAX_VALUE;
        int coluna = 7;

        for (int i = 0; i < matrizNumeros.length; i++) {

            if(matrizNumeros[i][coluna] > maiorNumeroC7) {
                maiorNumeroC7 = matrizNumeros[i][coluna];
            }

            if(matrizNumeros[i][coluna] < menorNumeroC7) {
                menorNumeroC7 = matrizNumeros[i][coluna];
            }

        }
        System.out.println();
        System.out.println("Maior valor C7: " + maiorNumeroC7);
        System.out.println("Menor valor C7: " + menorNumeroC7);
    }
}
