
package com.aula;

import java.util.Random;

/**
 *
 * @author camila_alves3
 */
public class Ex03_Matrizes_somaDiagonalPrincipal {
    
    /*
    *   3. Faça um algoritmo para ler uma matriz 3X3 real e imprimir a soma dos elementos da Diagonalprincipal.
    */
    public static void main(String[] args) {
        
        Random random = new Random();
        
        double[][] matrizNumerosReais = new double[3][3];
        
        double somaDiagonalPrincipal = 0.0;
        
        for (int linha = 0; linha < matrizNumerosReais.length; linha++) {
            
            for (int coluna = 0; coluna < matrizNumerosReais.length; coluna++) {
                
                matrizNumerosReais[linha][coluna] = random.nextDouble(10);
                
                if(linha == coluna) {
                    somaDiagonalPrincipal = somaDiagonalPrincipal + matrizNumerosReais[linha][coluna];
                }
                
                System.out.printf("%.2f ", matrizNumerosReais[linha][coluna]);
                
            }
            System.out.println("");            
            
        }
        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);     
        
        
        
    }
    
}
