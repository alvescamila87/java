
package aula04_vetores;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Vetores_Exe04_divisibilidadeNumero {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[10];
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            
            System.out.printf("Informe o %sº número inteiro do vetor: \n", i+1);
            vetorNumeros[i] = entrada.nextInt();
 
        } 
        
        System.out.println("Informe um valor inteiro e positivo: ");
        int valor = entrada.nextInt();
        
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int numero : vetorNumeros) {
            if (numero % valor ==0 ) {
//                System.out.printf("Esse número: %s do vetor, é divisível pelo valor informado: %s \n", numero, valor);
               numeros.add(numero);
            }
        }
        System.out.printf("Os números divisíveis por %s são: %s",valor, numeros);
        
        entrada.close();
    }
}
