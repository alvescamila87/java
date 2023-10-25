package aula04;

// exercicios: https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-20

import java.util.Random;

public class Matrizes_Exe01 {
    public static void main(String[] args) {
        
        int[][] matrizM = new int[4][4];

        Random numerosRandom = new Random();

        for (int linha = 0; linha < matrizM.length; linha++) {

            for (int coluna = 0; coluna < matrizM[linha].length; coluna++) {

                matrizM[linha][coluna] = numerosRandom.nextInt(100);

            }
        }

        int maiorValor = Integer.MIN_VALUE;
        int linhaMaiorValor = 0;
        int colunaMaiorValor = 0;

        // Preencher a matriz com números aleatórios
        for (int linha = 0; linha < matrizM.length; linha++) {

            for (int coluna = 0; coluna < matrizM[linha].length; coluna++) {

                if (matrizM[linha][coluna] > maiorValor) {
                    maiorValor = matrizM[linha][coluna];
                    linhaMaiorValor = linha;
                    colunaMaiorValor =  coluna;
                }

            }

        }
        // Imprimir a matriz

        for (int linha = 0; linha < matrizM.length; linha++) {

            for (int coluna = 0; coluna < matrizM[linha].length; coluna++) {

                System.out.print(matrizM[linha][coluna] + " ");
            }
            System.out.println();
        }

        // Imprimir dados sobre a matriz
        System.out.println("Maior valor encontrado: " + maiorValor);
        System.out.println("Na posição de linha: " + linhaMaiorValor);
        System.out.println("Na posição de coluna: " + colunaMaiorValor);
   }
}

