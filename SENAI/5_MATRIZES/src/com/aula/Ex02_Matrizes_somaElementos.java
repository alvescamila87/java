
package com.aula;

import java.util.Random;

/**
 *
 * 2. Elabore um algoritmo que leia uma matriz 4x4 de reais. Ao final, apresentar 
 * a soma dos elementos da primeira linha, e a soma dos elementos da terceira coluna, 
 * e a subtração do resultado destas somas
 */
public class Ex02_Matrizes_somaElementos {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        double soma = 0.0;
        
        double matrizNumerosReais[][] = new double[4][4];
        
        for (int linha = 0; linha < matrizNumerosReais.length; linha++) {
            
            for (int coluna = 0; coluna < matrizNumerosReais.length; coluna++) {
                
                matrizNumerosReais[linha][coluna] = random.nextDouble(10);
                soma = soma + matrizNumerosReais[linha][coluna];
                
            }
        }
        
        // imprimir matriz 
        
        for (int linha = 0; linha < matrizNumerosReais.length; linha++) {
            
            for (int coluna = 0; coluna < matrizNumerosReais.length; coluna++) {
                
                System.out.print(matrizNumerosReais[linha][coluna] + " ");
                
            }
            System.out.println("");
            
        }
        System.out.println("A soma elementos é de: " + soma);
        
    }
    
}
