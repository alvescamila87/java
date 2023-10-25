package aula04;

import java.util.Random;

public class Matrizes_Exe02 {
    public static void main(String[] args) {

        int[][] matrizNumeros = new int [10][10];

        Random numerosRandom = new Random();

        for (int i = 0; i < matrizNumeros.length; i++) {

            for (int j = 0; j < matrizNumeros[i].length; j++) {

                matrizNumeros[i][j] = numerosRandom.nextInt(100);

            }

        }



        // Imprimir Matriz com números randômicos

        for (int i = 0; i < matrizNumeros.length; i++) {

            for (int j = 0; j < matrizNumeros[i].length; j++) {

                System.out.print(matrizNumeros[i][j] + " ");

            }
            System.out.println();

        }

        int maiorValorL5 = Integer.MIN_VALUE;
        int menorValorL5 = Integer.MAX_VALUE;
        int linha5 = 5;


        for (int i = 0; i < matrizNumeros[linha5].length; i++) {
            if(matrizNumeros[linha5][i] > maiorValorL5) {
                maiorValorL5 = (matrizNumeros[linha5][i]);
            }

            if(matrizNumeros[linha5][i] < menorValorL5) {
                menorValorL5 = matrizNumeros[linha5][i];
            }
        }
        // Report de valores
        System.out.println("Maior valor da L5: " + maiorValorL5);
        System.out.println("Menor valor da L5: " + menorValorL5);






    }
}
