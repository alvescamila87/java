
package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe04 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe um valor inteiro para 'A': ");
        int num1 = entrada.nextInt();
        System.out.println("Informe um valor inteiro para 'B': ");
        int num2 = entrada.nextInt();
        
        // Saída de dados - ANTES do processamento
        System.out.printf("ANTES DA TROCA: A variável 'A' é: %s. \n", num1);
        System.out.printf("ANTES DA TROCA: A variável 'B' é: %s. \n", num2);
        
        // Processamento de dados
        int x = num1;
        num1 = num2;
        num2 = x;
        
        // Saída de dados
        System.out.printf("DEPOIS DA TROCA: A variável 'A' é: %s. \n", num1);
        System.out.printf("DEPOIS DA TROCA: A variável 'B' é: %s. \n", num2);
        
        entrada.close();        
    }
}
