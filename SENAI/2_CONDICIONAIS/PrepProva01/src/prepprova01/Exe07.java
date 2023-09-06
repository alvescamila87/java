package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe07 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        // Menu de pedidos
        System.out.println("Informe o código do lanche: ");
        System.out.println("[1] Bauru");
        System.out.println("[2] X-Galinha");
        System.out.println("[3] Pizza");
        int lanche = entrada.nextInt();
        
        System.out.println("Informe o código da bebida: ");
        System.out.println("[1] Água");
        System.out.println("[2] Vinho");
        System.out.println("[3] Guaraná");
        int bebida = entrada.nextInt();
        
        // Processamento de dados
        if (lanche == 1 && bebida == 3) {
            System.out.println("O pedido não pode ser atendido!");
            System.out.println("O lanche bauru não poderá ser acompanhado da bebida guaraná.");
        } 
        else if (lanche == 2 && bebida == 1)
            {
            System.out.println("O pedido não pode ser atendido!");
            System.out.println("Se o cliente pedir X galinha, não poderá pedir água.");
        } 
        else if (lanche == 3 && bebida == 3) {
            System.out.println("O pedido não pode ser atendido!");
            System.out.println("Quando o cliente pedir Pizza, somente poderá beber vinho ou água.");
        } 
        else {
            System.out.println("O pedido pode ser atendido!");
        }
        entrada.close();
    }
    
}
