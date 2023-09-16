
package arrays;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Camila
 */
public class TestaArray5_ArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("python");
        languages.add("javascript");
        
        System.out.println(languages);
        
        // Iteraror: percorrer a lista, independente de tipo da lista
        
        Iterator<String> it = languages.iterator();
        
        while(it.hasNext()) {
            String atual = it.next();
            System.out.println(atual);
            
            // é possível remover os elementos com:
            // it.remove();
        }
        
        // forEach: percorrer a lista
        for (String language : languages) {
            System.out.println(language);
        }
        
        Cliente gui = new Cliente();
        gui.nome = "Guilherme";
        
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        clientes.add(gui);
        
        System.out.println(gui.nome);
        System.out.println(clientes.get(0).nome);
        
        gui.nome = "Paulo";
        
        System.out.println(gui.nome);
        System.out.println(clientes.get(0).nome);
        System.out.println(clientes.size());
        
        
        
    }
    
}
