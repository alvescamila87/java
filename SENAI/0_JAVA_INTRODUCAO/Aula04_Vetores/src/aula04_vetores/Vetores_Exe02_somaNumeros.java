
package aula04_vetores;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Vetores_Exe02_somaNumeros {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[10];
        int soma = 0;
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            
            System.out.printf("Informe o %sº número inteiro do vetor: \n", i+1);
            vetorNumeros[i] = entrada.nextInt();
            
            soma = soma + vetorNumeros[i];
        }
        
        System.out.printf("A soma de todos os números no vetor é: %s. \n", soma);
        
        entrada.close();
    }
    
}
