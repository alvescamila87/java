
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex05_vetor_inveterValores2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[5];
        
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            
            System.out.printf("Informe o %sº valor inteiro: ", i + 1);                    
            vetorNumeros[i] = entrada.nextInt();
            
        }  
        System.out.println("\n");
        
        // imprimir o vetor conforme digitado
        for (int j = 0; j < 5; j++) {
            System.out.println(vetorNumeros[j]);
        }
        System.out.println("\n");
                
        
        // imprimir vetor invertido
        for (int l = 4; l >= 0; l--) {
            System.out.println(vetorNumeros[l]);
        }
        System.out.println("\n");

    }
}
