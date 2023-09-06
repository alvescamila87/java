package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe12 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o código do lanche que deseja: ");
        System.out.println("[101] Cachorro Quente");
        System.out.println("[102] Bauru Simples");
        System.out.println("[103] Bauru Com Ovo");
        System.out.println("[104] Hambúrger");
        System.out.println("[105] Cheeseburger");
        System.out.println("[106] Refrigerante");
        int codigo = entrada.nextInt();
        System.out.println("Informe a quantidade do lanche: ");
        int qtdLanche = entrada.nextInt();
        
        switch(codigo) {
            
            case 101: 
                float valor = 1.20f * qtdLanche;
                System.out.printf("Pedido: Cachorro Quente. Qtd: %s. Valor a pagar R$%.2f.\n.", qtdLanche, valor);
            break;
            case 102: 
                valor = 1.30f * qtdLanche;
                System.out.printf("Pedido: Cachorro Quente. Qtd: %s. Valor a pagar R$%.2f.\n.", qtdLanche, valor);
            break;
            case 103: 
                valor = 1.50f * qtdLanche;
                System.out.printf("Pedido: Cachorro Quente. Qtd: %s. Valor a pagar R$%.2f.\n.", qtdLanche, valor);
            break;
            case 104: 
                valor = 1.20f * qtdLanche;
                System.out.printf("Pedido: Cachorro Quente. Qtd: %s. Valor a pagar R$%.2f.\n.", qtdLanche, valor);
            break;
            case 105: 
                valor = 1.30f * qtdLanche;
                System.out.printf("Pedido: Cachorro Quente. Qtd: %s. Valor a pagar R$%.2f.\n.", qtdLanche, valor);
            break;
            case 106: 
                valor = 1.00f * qtdLanche;
                System.out.printf("Pedido: Cachorro Quente. Qtd: %s. Valor a pagar R$%.2f.\n.", qtdLanche, valor);
            break;
            default: System.out.println("ERRO: O código inválido!");
        }
        entrada.close();        
    }
    
}
