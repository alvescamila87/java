
package operadoresCondicionais;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe16 {
    public static void main(String[] args) {
        //Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um nome: ");
        String nome = entrada.nextLine();
        
        // Saída de dados
        System.out.printf("Welcome to the world, %s!\n", nome);
        
        entrada.close();        
    }
    
}
