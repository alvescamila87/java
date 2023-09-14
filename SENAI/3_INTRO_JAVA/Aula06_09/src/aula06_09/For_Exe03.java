
package aula06_09;

import java.util.Scanner;
import javax.swing.SpringLayout;

/**
 *
 * @author camila_alves3
 */
public class For_Exe03 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int valor;  
        int maiorValor = 0;
                        
        for (;;) { // Loop infinito
            System.out.println("Digite um número inteiro OU digite [-1] para PARAR: ");
            valor = entrada.nextInt();                   
           
            if (valor == -1) {
                break;
            }
            if (valor > maiorValor){
                maiorValor = valor;
            }
   
        }
        System.out.println("Maior valor informado: " + maiorValor); 
        
    entrada.close();     
        
    }
      
}

