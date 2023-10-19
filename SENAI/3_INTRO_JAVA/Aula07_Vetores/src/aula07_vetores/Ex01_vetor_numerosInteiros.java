
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex01_vetor_numerosInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[8];
        
        int maiorValor = Integer.MIN_VALUE;
        int posicaoMaiorValor = 0;
        
        // armazenar numeros inteiros no vetor
        for (int i = 0; i < vetorNumeros.length; i++) {
            
            System.out.printf("Informe o %sº número inteiro: ", i+1);
            vetorNumeros[i] = entrada.nextInt();
            
            if (vetorNumeros[i] > maiorValor) {
                maiorValor = vetorNumeros[i];
                posicaoMaiorValor = i;
            }
            
        }
        System.out.printf("Maior valor informado no vetor de 8 posições é: %s na posição %s. \n", maiorValor, posicaoMaiorValor);
        
        
    
    }
}
