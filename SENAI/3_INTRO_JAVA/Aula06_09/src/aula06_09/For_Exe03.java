
package aula06_09;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class For_Exe03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int valor;  
        int contador = 0;
        int maiorValor = 0;
                        
        for (;;) { // Loop infinito
            System.out.println("Informe um número inteiro ou digite -1 para parar: ");
            valor = entrada.nextInt();                   
            
            if (valor == -1) {
                break;
            }
            else {
                contador = contador + 1;
                
                if (contador == 1) {
                    maiorValor = valor;  
                    System.out.println("Maior valor informado: " + maiorValor);  
                } else {
                    if (valor > maiorValor) {
                        maiorValor = valor;
                        System.out.println("Maior valor informado: " + maiorValor);
                    }
                }
            }
                          
        }
       
        entrada.close();
    }
    
}
