
package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Aula10 {
    
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner (System.in);
         
       ArrayList<String> listaNomes = new ArrayList<>();
       
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Informe o nome da " + (i + 1) + "º pessoa:");
            listaNomes.add(entrada.next());
            
        }
        
        System.out.println(listaNomes);
        
        Collections.sort(listaNomes);
        
        System.out.println("Após Collections: " + listaNomes);
       
    }
            
    
}
