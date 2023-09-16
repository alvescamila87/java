
package aula04_vetores;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Vetores_Exe06_somaImpares_multiplicaPares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[5];
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.printf("Informe o %sº número da lista de vetores: \n", i+1);
            vetorNumeros[i] = entrada.nextInt();
        }
        int multiplicacao = 1;
        int soma = 0;
        for (int numero : vetorNumeros) {
            if (numero % 2 == 0) {
                multiplicacao = multiplicacao * numero;
            } else if (numero % 2 != 0) {
                soma = soma + numero;
            }
        }
        System.out.println("Lista de números: " + Arrays.toString(vetorNumeros));
        System.out.println("Multiplicação dos elementos pares: " + multiplicacao);
        System.out.println("Soma dos elementos ímpares: " + soma);
        
        entrada.close();
    }
    
}
