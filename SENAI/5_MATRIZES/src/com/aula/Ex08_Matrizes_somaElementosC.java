
package com.aula;

import java.util.Random;

/**
 *
 * @author Camila
 */
public class Ex08_Matrizes_somaElementosC {
    
    /*
    * 8. Ler uma matriz 4X3 real e imprimir a soma dos elementos no formato em C da matriz.
    */
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        double[][] matrizOriginal = new double[4][3];
        
        double somaElementos = 0;
        
        for (int linha = 0; linha < matrizOriginal.length; linha++) {
            
            for (int coluna = 0; coluna < matrizOriginal[0].length; coluna++) {
                
                matrizOriginal[linha][coluna] = random.nextDouble() * 10;
                
                if(linha == 0 || coluna == 0 || linha == 3) {
                    somaElementos = somaElementos + matrizOriginal[linha][coluna];
                }
                
                System.out.printf("%.2f ", matrizOriginal[linha][coluna]);
            }
            System.out.println("");
        }
        System.out.printf("A soma dos elementos de uma linha C da matriz é de: %.2f \n", somaElementos);
        
    }
    
}
