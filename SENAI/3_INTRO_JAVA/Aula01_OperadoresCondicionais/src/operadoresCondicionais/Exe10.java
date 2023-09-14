
package operadoresCondicionais;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe10 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num = entrada.nextInt();
        
        // Processamento de dados
        int numAntecessor = num - 1;
        int numSucessor = num + 1;
        
        // Saída de dados
        System.out.printf("Número informado: %s.\n", num);
        System.out.printf("Esse número tem o como antecessor o número: %s.\n", numAntecessor);
        System.out.printf("Esse número tem o como sucessor o número: %s.\n", numSucessor);
        
        entrada.close();
    }
            
    
}
