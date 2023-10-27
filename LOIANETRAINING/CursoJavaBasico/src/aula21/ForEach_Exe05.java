package aula21;

import java.util.Random;

public class ForEach_Exe05 {

    public static void main(String[] args) {

        int[][] matrizesNumeros = new int[10][10];

        Random random = new Random();

        for (int i = 0; i < matrizesNumeros.length; i++) {

            for (int j = 0; j < matrizesNumeros[i].length; j++) {

                matrizesNumeros[i][j] = random.nextInt(100);
                //System.out.print(matrizesNumeros[i][j] + " ");

            }
            //System.out.println();
        }

        for (int[] numeros : matrizesNumeros) {
            for (int numero : numeros) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }

        int maiorNumeroL5 = Integer.MIN_VALUE;
        int linha = 5;

        for (int i = 0; i < matrizesNumeros[linha].length; i++) {
            if(matrizesNumeros[linha][i] > maiorNumeroL5) {
                maiorNumeroL5 = matrizesNumeros[linha][i];

            }
        }
        System.out.println();
        System.out.println("Maior número da linha 5: " + maiorNumeroL5);

        int maiorNumeroC7 = Integer.MIN_VALUE;
        int coluna = 7;

        for (int i = 0; i < matrizesNumeros.length; i++) {
            if(matrizesNumeros[i][coluna] > maiorNumeroC7) {
                maiorNumeroC7 = matrizesNumeros[i][coluna];
            }
        }
        System.out.println();
        System.out.println("Maior número da coluna 7: " + maiorNumeroC7);

    }
}
