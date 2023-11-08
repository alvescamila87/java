
package aula03_lacosrepeticaowhile;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class While_Exe07_maiorNumero {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero = 0;
        int contador = 0;
        int soma = 0;
        int maiorValor = Integer.MIN_VALUE;
        
        while (numero != -1) {
            System.out.println("Informe um número inteiro OU digite -1 para parar: ");
            numero = entrada.nextInt();
            soma = soma + numero;
            contador ++;
          
            if (contador == 1) {
                maiorValor = numero;
            } 
            else if (contador > 1) {
                if (numero > maiorValor) {
                    maiorValor = numero;
                }
            }
            
            if (numero == -1) {
                contador--;
                break;
            } 

        }
        System.out.printf("Total de números: %s. Maior valor: %s .\n", contador, maiorValor);
        
        entrada.close();
        
    }
    
}
