
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Camila
 */
public class Aula04 {
    
    public static void main(String[] args) {
        
        ArrayList<Character> codigos = new ArrayList<>();
        
        codigos.add('A');
        codigos.add('C');
        codigos.add('G');
        
        
        codigos.set(0, 'T');
        
        for(Character codigo : codigos) {
            System.out.println(codigo);
        }
        
        codigos.remove(2);
        
        System.out.println(codigos);
        
        
                
             
        
        
        
    }
            
    
}
