
package arrays;

import java.util.ArrayList;

/**
 *
 * @author Camila
 */
public class TestaArray4_ArrayList {
    public static void main(String[] args) {
        
        // declaração
        ArrayList<String> nomes = new ArrayList<>();
        
        nomes.add("java");
        nomes.add("python");
        
        System.out.println(nomes);
        System.out.println(nomes.contains("java")); // retorna boolean
        
        // adicionar itens
        
        nomes.add("javascript");
        System.out.println(nomes.contains("javascript"));
        
        // remover itens
        
        nomes.remove("python");
        System.out.println(nomes.contains("python"));
        
        // tamanho do arraylist é diferente do array(length)
        System.out.println(nomes.size());
        
        // converter arraylist para array de object
        nomes.toArray();
        System.out.println(nomes);
        // ou
        // Object[] objetos = nomes.toArray();

        // converter arraylist para array de string
        String[] nomesArray = nomes.toArray(new String[nomes.size()]);
        // ou
        String[] nomesArray2 = nomes.toArray(new String[0]);
        
        // juntar dois arrayslists
        
        ArrayList<String> paises = new ArrayList<>();
        paises.add("Brasil");
        paises.add("Holanda");
        
        ArrayList<String> tudo = new ArrayList<>();
        
        tudo.addAll(nomes);
        tudo.addAll(paises);
        
        System.out.println(tudo.size());
        
        // consultar valores de arrayslist
        
        System.out.println(nomes.get(0));
        nomes.add(0, "python");
        System.out.println(nomes.get(0));
        System.out.println(nomes.get(1));
        
         // modificar valores de arrayslist
         nomes.add(2, "c#");
         nomes.remove(1); //java
         nomes.set(2, "pascal");
         System.out.println(nomes);
         
         // verificar indice do elemento no arrayslist
         System.out.println(nomes.indexOf("python"));
         System.out.println(nomes.lastIndexOf("python"));
         
         
        
    }
}
