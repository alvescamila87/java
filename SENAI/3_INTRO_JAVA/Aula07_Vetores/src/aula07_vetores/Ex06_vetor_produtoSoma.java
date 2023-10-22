
package aula07_vetores;

import java.util.Scanner;
/**
 *
 * @author Camila
 */

public class Ex06_vetor_produtoSoma {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[10];
        
        int produtoPares = 1;
        int somaImpares = 0;
        
        for (int i = 0; i < vetorNumeros.length; i++) {

            System.out.printf("Informe o %sº número inteiro: \n", i+1);
            vetorNumeros[i] = entrada.nextInt();
            
            if (vetorNumeros[i] % 2 == 0) {
                produtoPares = produtoPares * vetorNumeros[i];
            } else {
                somaImpares = somaImpares + vetorNumeros[i];
            }
            
        }
        System.out.printf("O produto de todos os elementos pares do vetor é: %s .\n", produtoPares);
        System.out.printf("A soma de todos os elementos ímpares do vetor é: %s .\n", somaImpares);
        entrada.close();
    }
}
