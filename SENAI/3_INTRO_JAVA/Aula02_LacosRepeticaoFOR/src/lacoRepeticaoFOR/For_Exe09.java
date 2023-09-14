package lacoRepeticaoFOR;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class For_Exe09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
             
        
        for(;;) {
            System.out.println("Informe um valor inteiro ou digite zero para parar: ");
            int valor = entrada.nextInt();
            
            if (valor == -1) {
                break;
            }
            
            if (valor % 2 != 0) {
                System.out.println("Número ímpar: " + valor);
            }
            
        }
        
        
    }
    
}
