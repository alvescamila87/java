package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe11 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o preço do produto: ");
        float valor = entrada.nextFloat();
        System.out.println("Informe o código de origem do produto: ");
        System.out.printf("[1] Região norte \n");
        System.out.printf("[2] Região sul \n");
        System.out.printf("[3] Região sudeste \n");
        System.out.printf("[4] Região nordeste \n");
        System.out.printf("[5] Região centro-oeste \n");
        int codigo = entrada.nextInt();
        
        switch(codigo) {
            case 1: 
                float desconto = 5f * valor / 100;
                float novoValor = valor - desconto;
                System.out.printf("Produto do NORTE com desconto! Valor anterior R$%.2f -> Valor com desconto R$%.2f. \n", valor, novoValor);
            break;
            case 2: 
                desconto = 15f * valor / 100;
                novoValor = valor - desconto;
                System.out.printf("Produto do SUL com desconto! Valor anterior R$%.2f -> Valor com desconto R$%.2f. \n", valor, novoValor);
            break;
            case 3: 
                desconto = 7f * valor / 100;
                novoValor = valor - desconto;
                System.out.printf("Produto do SUDESTE com desconto! Valor anterior R$%.2f -> Valor com desconto R$%.2f. \n", valor, novoValor);
            break;
            case 4: 
                desconto = 12f * valor / 100;
                novoValor = valor - desconto;
                System.out.printf("Produto do NORDESTE com desconto! Valor anterior R$%.2f -> Valor com desconto R$%.2f. \n", valor, novoValor);
            break;
            case 5: 
                desconto = 20f * valor / 100;
                novoValor = valor - desconto;
                System.out.printf("Produto do CENTRO-OESTE com desconto! Valor anterior R$%.2f -> Valor com desconto R$%.2f. \n", valor, novoValor);
            break;
            default: System.out.println("ERRO: O código de origem informado é de produto importado!");
            }
        
            entrada.close();
        
    }
    
}
