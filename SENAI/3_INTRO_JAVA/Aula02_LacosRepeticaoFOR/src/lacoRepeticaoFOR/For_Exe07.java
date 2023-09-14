package lacoRepeticaoFOR;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class For_Exe07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        
        
        for (;;) {
            System.out.println("Informe um número inteiro ou digite -1 para parar: ");
            int valor = entrada.nextInt();
            
            if (valor == -1) {
                break;
            }
            
            if (valor % 2 == 0) {
                System.out.println("Número par: " + valor);
            }
        }
    }
    
}
