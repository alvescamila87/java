
package com.aula;

import java.util.Random;

/**
 *
 * @author camila_alves3
 */
public class Ex01_Matrizes_imprimirMatriz {

    /**
     * 1. Escreva um algoritmo que leia os elementos de uma matriz 5x5 de inteiros. Ao final, o algoritmo
     * deverá mostrar a soma de todos os elementos.
     */
    public static void main(String[] args) {
        
        Random numerosAleatorios = new Random();
        
        int[][] matrizNumeros = new int[5][5];
        
        for (int linha = 0; linha < matrizNumeros.length; linha++) {
            
            for (int coluna = 0; coluna < matrizNumeros.length; coluna++) {
                
                matrizNumeros[linha][coluna] = numerosAleatorios.nextInt(100);
                
            }
            System.out.println("");
            
        }
        
        System.out.println("Matriz gerada com Random");
        System.out.println("");
        for (int linha = 0; linha < 5; linha++) {
            
            for (int coluna = 0; coluna < 5; coluna++) {
                
                System.out.print(matrizNumeros[linha][coluna] + " ");
                
            }
            System.out.println("");
            
        }
    }

        
}
