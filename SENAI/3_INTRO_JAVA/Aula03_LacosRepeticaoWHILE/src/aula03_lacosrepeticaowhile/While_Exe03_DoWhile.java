
package aula03_lacosrepeticaowhile;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class While_Exe03_DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int contador = 0;
        do {
            System.out.println("Informe um número inteiro OU digite zero para parar: ");
            int numero = entrada.nextInt();
            contador++;
            
            if (numero == 0) {
                break;
            }
        } while (contador != 0);
    }
    
}
