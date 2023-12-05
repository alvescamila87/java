
package com.aula;

import java.util.Random;

/**
 *
 * @author camila_alves3
 */
public class Ex01_Matrizes_SomaElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random numerosAleatorios = new Random();
        
        int[][] matrizNumeros = new int[5][5];
        
        for (int linha = 0; linha < 5; linha++) {
            
            for (int coluna = 0; coluna < 5; coluna++) {
                
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
