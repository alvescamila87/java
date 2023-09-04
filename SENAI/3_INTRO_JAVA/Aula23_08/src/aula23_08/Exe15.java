
package aula23_08;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe15 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe um valor inteiro para 'A': ");
        int num1 = teclado.nextInt();
        System.out.println("Informe um valor inteiro para 'B': ");
        int num2 = teclado.nextInt();
        
        // Processamento de dados
        int x = num1;
        num1 = num2;
        num2 = x;
        
        // Saída de dados
        System.out.printf("Na troca com B, a variável A recebeu: %s. \n", num1);
        System.out.printf("Na troca com A, a variável B recebeu: %s. \n", num2);
        
        teclado.close();
    }
    
}
