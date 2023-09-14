
package aula03_lacosrepeticaowhile;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class While_Exe06_imprimirPares {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero = 0;
        int contador = 0;
        
       
        System.out.println("Informe quantos números deseja informar: ");
        numero = entrada.nextInt();
        
        while (contador <= numero) {
            
            if (contador  % 2 == 0) {
                System.out.println("Número par: " + contador);
            }
            contador++;
        }
    }
    
}
