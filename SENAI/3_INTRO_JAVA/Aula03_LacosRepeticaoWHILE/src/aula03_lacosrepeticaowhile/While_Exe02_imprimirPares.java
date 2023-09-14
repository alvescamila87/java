
package aula03_lacosrepeticaowhile;

/**
 *
 * @author Camila
 */
public class While_Exe02_imprimirPares {
    public static void main(String[] args) {
        
        int contador = 1;
        
        while (contador <= 50) {
            if (contador % 2 == 0) {
                System.out.println("Número par: " + contador);
            }
            contador++;
        }
    }
    
}
