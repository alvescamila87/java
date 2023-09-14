package aula06_09;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class For_Exe04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
    
        System.out.println("Informe um número da tabuada que deseja (1 a 10): ");
        int tabuada = entrada.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s X %s = %s \n", tabuada, i, tabuada * i);
        }
    }

            
            
    
}
