
package arraylist;

import java.util.ArrayList;

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
        
        for(Integer number : myNumbers) {
            System.out.println(number);
        }
        
    }
            
    
}
