
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Ex05_vetor_inveterValores {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[5];
        
        // lendo os valores 
        for (int i = 0; i < vetorNumeros.length; i++) {
            
            System.out.printf("Informe o %sº número inteiro: \n", i + 1);
            vetorNumeros[i] = entrada.nextInt();
            
        }
        
        // imprimindo os valores digitados do vetor
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.printf("%s ", vetorNumeros[i]);
        }
        System.out.println(" ");
        
        // invertendo valores do vetor        
        for (int i = 0; i < vetorNumeros.length / 2; i++) {
            int temp = vetorNumeros[i];
            vetorNumeros[i] = vetorNumeros[4 - i];
            vetorNumeros[4 - i] = temp;
        }
        
        // imprimindo os valores invertidos
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.printf("%s ", vetorNumeros[i]);
        }
        entrada.close();        
    }
}
