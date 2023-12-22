
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<String> listaNomes = new ArrayList<>();
        
        for (int i = 0; i < 4; i++) {
            
            System.out.printf("Informe o %sº nome: ", i + 1);                    
            listaNomes.add(entrada.next());                 
            
        }
        System.out.println(listaNomes);                                      
        
    }
    
}
