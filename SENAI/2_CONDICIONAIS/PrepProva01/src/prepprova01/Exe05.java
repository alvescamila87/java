
package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe05 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe um valor inteiro para N1: ");
        int num1 = entrada.nextInt();
        System.out.println("Informe um valor inteiro para N2: ");
        int num2 = entrada.nextInt();
        
        // Menu da calculadora
        System.out.println("Informe qual operação deseja realizar: ");
        System.out.println("[1] Adição");
        System.out.println("[2] Subtração");
        System.out.println("[3] Divisão");
        System.out.println("[4] Multiplicação");
        int opcao = entrada.nextInt();
                
        // Processamento e saída de dados
        switch(opcao) {
            case 1: 
                int resultado = num1 + num2;
                System.out.printf("A soma dos números: %s e %s é: %s.\n", num1, num2, resultado);
            break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("A subtração dos números: %s e %s é: %s.\n", num1, num2, resultado);
            break;
            case 3:
                if (num2 == 0) {
                    System.out.println("ERROR: Não é possível realizar a divisão de número por ZERO!");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("A divisão dos números: %s e %s é: %s.\n", num1, num2, resultado);
                }
            break;
            case 4: 
                resultado = num1 * num2;
                System.out.printf("A multiplicação dos números: %s e %s é: %s.\n", num1, num2, resultado);
            break;
            default:
                System.out.printf("ERRO: Opção inválida! Tente novamente...");
            
        }
        
        entrada.close();
    }
    
}
