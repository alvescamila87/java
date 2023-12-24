
package arraylist;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Camila
 */
public class Aula08 {
    
    public static void main(String[] args) {
        
        ArrayList<Float> listaPreco = new ArrayList<>();
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Informe o " + (i +1) + "º preço: ");            
            listaPreco.add(entrada.nextFloat());
            
        }
        
        System.out.println(listaPreco);      
        
        
            
        
        
    }
            
    
}
