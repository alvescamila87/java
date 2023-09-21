
package aula03_lacosrepeticaowhile;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class While_Exe05_DoWhile_B {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int tamanhoPalavra = 0;
        
        System.out.println("Informe uma palavra: ");
        String palavra = entrada.next();
        tamanhoPalavra = palavra.length()-1;
        
        do {
            tamanhoPalavra--;  
            System.out.print(palavra.charAt(tamanhoPalavra));             
        } 
        while(tamanhoPalavra > 0);
    }
    
}
