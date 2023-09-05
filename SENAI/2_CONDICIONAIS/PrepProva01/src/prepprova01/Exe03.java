
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
        int qtdLivros = entrada.nextInt();
        
        // Processamento de dados
        if (qtdLivros <= 10) {
            System.out.printf("Quantidade de livros: %s -> Total a pagar R$%.2f. \n", qtdLivros, qtdLivros* 12.00);
        } 
        else {
           System.out.printf("Quantidade de livros: %s -> Total a pagar R$%.2f. \n", qtdLivros, qtdLivros* 8.00); 
        }
        
        entrada.close();
    }
    
}
