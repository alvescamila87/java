
package aula04_vetores;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Vetores_Exe03_numerosPrimos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[5];
               
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.printf("Informe o %sº números inteiro do vetor: ", i+1);
            vetorNumeros[i] = entrada.nextInt();
            
            int divisoes = 0; 
            
            for (int contador = 1; contador <= vetorNumeros[i]; contador++) {
                if (vetorNumeros[i] % contador == 0) {
                    divisoes++;
                }  
            }
            if (divisoes == 2) {
                System.out.println("É primo: " + vetorNumeros[i]);
            }
        }
        entrada.close();
    }
    
}
