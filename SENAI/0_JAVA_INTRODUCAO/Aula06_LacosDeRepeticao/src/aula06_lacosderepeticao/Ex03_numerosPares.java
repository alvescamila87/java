package aula06_lacosderepeticao;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex03_numerosPares {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int contador = 0;
        
        System.out.println("Informe um número inteiro limite: ");
        int numero = entrada.nextInt();
        
        
        if (numero < 0) {
            
            System.out.println("Erro: Número inválido. Programa finalizado.");
                       
        } else {
                       
            while (contador < numero) {
                
               
                if (contador % 2 == 0) {
                    System.out.printf("Número par: %s \n", contador , contador);
                    
                }
                
                contador++;
                
            }
        }
    }
    
}
