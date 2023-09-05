
package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe03 {
    public static void main(String[] args) {
       // Entrada de dados
       Scanner entrada = new Scanner (System.in);
        System.out.println("Informe a quantidade de livros a comprar: ");
        int qtd_livros = entrada.nextInt();
        
        // Processamento de dados
        if (qtd_livros <= 10) {
            System.out.printf("Quantidade de livros: %s -> Total a pagar R$%.2f. \n", qtd_livros, qtd_livros* 12.00);
        } 
        else {
           System.out.printf("Quantidade de livros: %s -> Total a pagar R$%.2f. \n", qtd_livros, qtd_livros* 8.00); 
        }
        
        entrada.close();
    }
    
}
