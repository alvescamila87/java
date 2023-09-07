
package exe27_quadradocubico;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe27_QuadradoCubico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe um valor inteiro: ");
        int num = entrada.nextInt();
        System.out.println("Selecione uma operação: ");
        System.out.println("[1] Calcular valor quadrado");
        System.out.println("[2] Calcular valor cúbico");
        int opcao = entrada.nextInt();
        
        
        switch(opcao) {
            case 1: System.out.printf("O valor quadrado de %s é: %s. \n", num, num * num);
            break;
            case 2: System.out.printf("O valor cúbico de %s é: %s. \n", num, num * num * num);
            break;
            default: System.out.println("ERRO: Opção inválida. Tente novamente!");
        }
            
        entrada.close();
    }
    
}