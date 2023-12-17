
package com.aula;

import java.util.Random;

/**
 *
 * @author Camila
 */
public class Ex05_Matrizes_imprimirCuboDoElemento {
    
    /*
    * 5. Ler uma matriz 5X5 e gerar outra em que cada elemento é o cubo do elemento respectivo na
    * matriz original. Imprima depois esta nova matriz.
    */
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        int[][] matrizOriginal = new int[5][5];
        int[][] matrizCubica = new int[5][5];
        
        System.out.println("Matriz Original");
        
        for (int linha = 0; linha < matrizOriginal.length; linha++) {
            
            for (int coluna = 0; coluna < matrizOriginal.length; coluna++) {
                
                matrizOriginal[linha][coluna] = random.nextInt(10);
                
                matrizCubica[linha][coluna] = matrizOriginal[linha][coluna] * matrizOriginal[linha][coluna] * matrizOriginal[linha][coluna];
                
                System.out.print(matrizOriginal[linha][coluna] + " ");
                
            }
            System.out.println("");
        }
        
        System.out.println();
        System.out.println("Matriz Cúbica");
        
        for (int linha = 0; linha < matrizCubica.length; linha++) {
            
            for (int coluna = 0; coluna < matrizCubica.length; coluna++) {
                
                System.out.print(matrizCubica[linha][coluna] + " ");
                
            }
            System.out.println("");
        }
        
        
        
    }
            
    
}
