
package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Camila
 */
public class Aula05 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> numerosInteiros = new ArrayList<>();
        
        Random random = new Random();
        
        for (int i = 0; i < 10; i++) {
            
            numerosInteiros.add(random.nextInt(10));
            
        }
        
        System.out.println(numerosInteiros);
        
        numerosInteiros.clear();
        
        numerosInteiros.add(0, 2);
        
        System.out.println(numerosInteiros);
        
        
        
    }
            
    
}
