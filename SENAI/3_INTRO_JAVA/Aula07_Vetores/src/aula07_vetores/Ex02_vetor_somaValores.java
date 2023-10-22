
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex02_vetor_somaValores {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[10];
        int soma = 0;
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            
            System.out.printf("Informe o %sº valor inteiro: ", i + 1);                    
            vetorNumeros[i] = entrada.nextInt();
            soma = soma + vetorNumeros[i];                   
            
        }
        System.out.println("A soma dos 10 valores informados é: " + soma);
        entrada.close();

    }
    
}
