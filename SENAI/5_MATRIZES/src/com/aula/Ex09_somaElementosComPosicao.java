
package com.aula;

/**
 *
 * @author Camila
 */
public class Ex09_somaElementosComPosicao {
    
    /*
    * 9. Crie uma matriz 7X8 onde cada elemento é a soma dos índices de sua posição dentro da matriz.
    */
    
    public static void main(String[] args) {
        
        
        int[][] matrizOriginal = new int[7][8];
                
        for (int linha = 0; linha < matrizOriginal.length; linha++) {
            
            for (int coluna = 0; coluna < matrizOriginal[0].length; coluna++) {
                
                matrizOriginal[linha][coluna] = linha + coluna;
                                
                System.out.printf("%s ", matrizOriginal[linha][coluna]);
            }
            System.out.println("");
        }
        
    }
    
}
