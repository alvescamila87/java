
package aula06_09;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class For_Exe05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int valor;
        int menorValor = Integer.MAX_VALUE;
        
        System.out.println("Informe um número inteiro OU digite zero para parar: ");
        valor = entrada.nextInt();
        
        for (;;) {
            System.out.println("Informe um número inteiro OU digite zero para parar: ");
            valor = entrada.nextInt();  
            
            if (valor == 0) {
                break;
            }
           
            if (valor < menorValor) {
                menorValor = valor;
            }           
        }
        System.out.println("Menor valor informador: "  + menorValor);
    }
    
}
