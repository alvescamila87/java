
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex04_vetor_numerosDivisiveis {
    
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[10];
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            
            System.out.printf("Informe o %sº número inteiro: ", i + 1);
            vetorNumeros[i] = entrada.nextInt();        
            
        }
        
        System.out.println("Informe um novo valor inteiro e positivo, para verificarmos as divisões: ");
        int valorDivisivel = entrada.nextInt();
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            
            if (vetorNumeros[i] % valorDivisivel == 0) {
                
                System.out.printf("É divisível por %s o número informado: %s.\n", valorDivisivel,vetorNumeros[i]);
            }
        }
        entrada.close();        
    }
    
}
