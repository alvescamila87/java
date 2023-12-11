package com.aula;

import java.util.Random;

/**
 *
 * @author camila_alves3
 */
public class Ex04_Matrizes_imprimirMatrizTransposta {
    
    /*
    * 4. Faça um algoritmo para ler uma matriz 2X3 real e depois gerar e imprimir sua transposta 
    * (matriz 3X2 equivalente).
    */
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        double[][] matrizNumerosReaisOriginal = new double[2][3];
        
        double[][] matrizTransposta = new double[3][2];
        
        System.out.println("Matriz Original");
        for (int linha = 0; linha < matrizNumerosReaisOriginal.length; linha++) {
            
            for (int coluna = 0; coluna < matrizNumerosReaisOriginal[0].length; coluna++) {
                
                matrizNumerosReaisOriginal[linha][coluna] = random.nextDouble() * 10;
                
                System.out.printf("%.2f ", matrizNumerosReaisOriginal[linha][coluna]);
                
                matrizTransposta[coluna][linha] = matrizNumerosReaisOriginal[linha][coluna];            
                
                
            }
            System.out.println("");
            
        }
        
        System.out.println("Matriz transposta");
        
        for (int linha = 0; linha < matrizTransposta.length; linha++) {
            
            for (int coluna = 0; coluna < matrizTransposta[0].length; coluna++) {
                
                System.out.printf("%.2f ", matrizTransposta[linha][coluna]);
                
            }
            System.out.println("");
            
        }
        
                
    }
    
}