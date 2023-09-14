
package lacoRepeticaoFOR;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class For_Exe03_B {
        public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int valor;  
        int contador = 0;
        int maiorValor = Integer.MIN_VALUE; // menor valor que o INT pode ter
        int menorValor = Integer.MAX_VALUE; // maior valor que o INT pode ter
                        
        for (;;) { // Loop infinito
            System.out.println("Digite um número inteiro OU digite [-1] para PARAR: ");
            valor = entrada.nextInt();                   
            contador = contador + 1;
           
            if (valor == -1) {
                break;
            }
            if (contador == 1) {
                maiorValor = valor;
                menorValor = valor;
            } else {
                if (valor > maiorValor) {
                maiorValor = valor;
                } else if (valor < menorValor) {
                    menorValor = valor;
                }   
            }
               
        }
        System.out.println("Maior valor informado: " + maiorValor); 
        System.out.println("Menor valor informado: " + menorValor);  
        
        entrada.close();
}
    
}
