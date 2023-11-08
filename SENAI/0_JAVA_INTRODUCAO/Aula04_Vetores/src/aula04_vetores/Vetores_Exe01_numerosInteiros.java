package aula04_vetores;


import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Vetores_Exe01_numerosInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int[] vetorNumeros = new int[8];
        
        // inserir valores no array
        for (int i = 0; i < vetorNumeros.length; i++) {
            
            System.out.printf("Informe o %sº número inteiro: \n", i+1);
            vetorNumeros[i] = entrada.nextInt();            
        }
        
        // verificar maior valor do array
        int maiorValor = Integer.MIN_VALUE;
        
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros.length == 1) {
                maiorValor = vetorNumeros[i]; 
                System.out.printf("Maior valor informado é '%s' no índice %s do vetor. \n",maiorValor, i);
            } else {
                if (vetorNumeros[i] > maiorValor) {
                    maiorValor = vetorNumeros[i];
                    System.out.printf("Maior valor informado é '%s' no índice %s do vetor. \n",maiorValor, i);
                }
            }
        }
        entrada.close();
        
    }
    
}
