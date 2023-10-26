package aula04;

import java.util.Random;

public class Matrizes_Exe01 {

    public static void main(String[] args) {
        
        int[][] matrizNumeros = new int[4][4];

        Random numerosAleatorios = new Random();

        for (int linha = 0; linha < matrizNumeros.length; linha++) {
            
            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {
                
                matrizNumeros[linha][coluna] = numerosAleatorios.nextInt(100);
                
            }
        }

        int maiorNumero = Integer.MIN_VALUE;
        int linhaMaiorNumero = 0;
        int colunaMaiorNumero = 0;


        // Imprimir matriz com números aleatórios
        for (int linha = 0; linha < matrizNumeros.length; linha++) {

            for (int coluna = 0; coluna < matrizNumeros[linha].length; coluna++) {

                System.out.print(matrizNumeros[linha][coluna] + " ");

                if (matrizNumeros[linha][coluna] > maiorNumero) {
                    maiorNumero = matrizNumeros[linha][coluna];
                    linhaMaiorNumero = linha;
                    colunaMaiorNumero = coluna;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("O maior número encontrado foi " + maiorNumero);
        System.out.println("Identificadção do meio valor na linha:  " + linhaMaiorNumero);
        System.out.println("Identificadção do meio valor na coluna: " + colunaMaiorNumero);
    }
}
