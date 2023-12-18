
package com.aula;

import java.util.Random;

/**
 *
 * @author Camila
 */
public class Ex06_Matrizes_imprimirCantoSuperiorInferior {
    
    /*
    * 6. Faça um algoritmo para ler uma matriz de 3×4 de números reais e depois exibir o elemento do
    * canto superior esquerdo e do canto inferior.
    */
    
    public static void main(String[] args) {
        
        Random random = new Random();
        
        double[][] matrizOriginal = new double[3][4];
        
        double cantoSuperiorEsquerdo = Integer.MAX_VALUE;
        double cantoInferiorEsquerdo = Integer.MAX_VALUE;
        
        for (int linha = 0; linha < matrizOriginal.length; linha++) {
            
            for (int coluna = 0; coluna < matrizOriginal[0].length; coluna++) {
                
                matrizOriginal[linha][coluna] = random.nextDouble(10);
                
                if(linha == 0 && coluna == 0){
                    cantoSuperiorEsquerdo = matrizOriginal[linha][coluna];
                }
                
                if(linha == 2 && coluna == 0){
                    cantoInferiorEsquerdo = matrizOriginal[linha][coluna];
                }
                
                System.out.printf("%.2f ", matrizOriginal[linha][coluna]);            
                
                
            }
            System.out.println("");                    
        }
        System.out.printf("O canto superior esquerdo possui o elemento: %.2f. \n", cantoSuperiorEsquerdo);
        System.out.printf("O canto inferior esquerdo possui o elemento: %.2f. \n", cantoInferiorEsquerdo);
        
    }
    
}
