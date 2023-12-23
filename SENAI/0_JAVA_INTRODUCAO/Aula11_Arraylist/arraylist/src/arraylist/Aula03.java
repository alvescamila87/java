
package arraylist;

import java.util.ArrayList;

/**
 *
 * @author Camila
 */
public class Aula03 {
    
    public static void main(String[] args) {
        
        ArrayList<String> cars = new ArrayList<>();
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        System.out.println(cars);
        
        System.out.println(cars.get(1));
        System.out.println(cars.get(3));
        
        
        cars.set(2, "Mercedes");
        cars.set(3, "Audi");
        
        System.out.println(cars);
        
        System.out.println("Imprimindo lista 1: ");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("Imprimindo lista 2: ");
        for(String car : cars) {
            System.out.println(car);
        }
        
        cars.remove(0);
        
        System.out.println(cars);
        
        System.out.println(cars.size());
        
        cars.clear();
        
        System.out.println(cars);
        
        
        
    }
            
    
}
