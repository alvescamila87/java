
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex03_vetor_numerosPrimos {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[5];
        
        // entrada
        for (int i = 0; i < vetorNumeros.length; i++) { 
            
            System.out.printf("Informe o %sº número inteiro: ", i + 1);
            vetorNumeros[i] = entrada.nextInt();
            
        }
        
        // impressão se é primo
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 != 0 && vetorNumeros[i] % 3 != 0 || vetorNumeros[i] == 2 || vetorNumeros[i] == 3) {
                System.out.printf("É primo: %s.\n", vetorNumeros[i]); 
            }               
            
        }
        entrada.close();      
                
    }
    
}
