
package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author camila_alves3
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random random = new Random();
        
        ArrayList<Integer> listNumbers = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            
            listNumbers.add(random.nextInt(100));            
            
        }
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println(listNumbers.get(i) + " ");
            
        }
        
        
        
        
    }
    
}
