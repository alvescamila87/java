
package arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Camila
 */
public class Aula09 {
    
    public static void main(String[] args) {
        
        
        ArrayList<Integer> myNumbers = new ArrayList<>();
        
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(13);
        myNumbers.add(2);
        
        System.out.println("Before ordering list with Collections");
        for(Integer number : myNumbers) {
            System.out.println(number);
        }
        
        Collections.sort(myNumbers); //order list                
        
        System.out.println("After ordering list with Collections");
        for(Integer number : myNumbers) {
            System.out.println(number);
        }
        
    }
            
    
}
