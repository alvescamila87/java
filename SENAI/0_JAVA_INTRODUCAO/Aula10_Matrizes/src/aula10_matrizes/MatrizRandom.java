/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula10_matrizes;

import java.util.Random;

/**
 *
 * @author camila_alves3
 */
public class MatrizRandom {
    
    public static void main(String[] args) {
      
        int[][] matrizNumeros = new int[3][3];
    
        Random numerosAleatorios = new Random(); 
    
        for (int linha = 0; linha < matrizNumeros.length; linha++) {
            
            for (int coluna = 0; coluna < matrizNumeros.length; coluna++) {
                
                matrizNumeros[linha][coluna] = numerosAleatorios.nextInt(100);
                
                System.out.print(matrizNumeros[linha][coluna] + " ");
            }
            System.out.println("");
            
        }
        
  
    }
    
    
    
}
