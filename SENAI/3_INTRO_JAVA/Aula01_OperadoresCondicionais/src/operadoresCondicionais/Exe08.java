
package operadoresCondicionais;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe08 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o valor do produto: ");
        float valorProduto = entrada.nextFloat();
        
        System.out.println("Informe a porcentagem de desconto: ");
        float percentualDesconto = entrada.nextFloat();
        
        // Processamento de dados
        percentualDesconto = valorProduto * (percentualDesconto / 100);
        float novoValorProduto = valorProduto - percentualDesconto;
        
        // Saída de dados
        System.out.printf("Valor do produto original SEM desconto: R$%.2f.\n", valorProduto);
        System.out.printf("Valor do produto COM desconto: R$%.2f.\n", novoValorProduto);
       
        entrada.close();
        
    }
    
}
