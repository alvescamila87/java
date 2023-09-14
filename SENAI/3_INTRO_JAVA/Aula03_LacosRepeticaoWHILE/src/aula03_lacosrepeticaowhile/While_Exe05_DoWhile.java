
package aula03_lacosrepeticaowhile;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class While_Exe05_DoWhile {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int contador = 0;
        do {
            System.out.println("Informe uma palavra: ");
            String palavra = entrada.next();
            
            StringBuilder palavraInvertida = new StringBuilder(palavra).reverse();
            System.out.printf("A palavra informada é %s e invertida fica: %s.\n", palavra,palavraInvertida);
            
            contador++;
            
        } while (contador <= 3);
    }
    
}
