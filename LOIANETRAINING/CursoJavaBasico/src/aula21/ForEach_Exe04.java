package aula21;

import java.util.Random;

public class ForEach_Exe04 {
    public static void main(String[] args) {

        int[][] matrizNumeros = new int[4][4];

        Random random = new Random();

        for (int i = 0; i < matrizNumeros.length; i++) {

            for (int j = 0; j < matrizNumeros[i].length; j++) {

                matrizNumeros[i][j] = random.nextInt(100);

            }
        }

        for (int[] numeros: matrizNumeros) {
            for (int numero : numeros) {
                System.out.print(numero + " ");

            }
            System.out.println();
        }
    }
}
