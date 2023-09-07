
package exe30_somamultiplicacao;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe30_SomaMultiplicacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Selecione uma operação: ");
        System.out.println("[1] Soma");
        System.out.println("[2] Multiplicação");
        System.out.println("[3] Finalizar");
        int opcao = entrada.nextInt();
        System.out.println("Informe um valor inteiro para N1: ");
        int num1 = entrada.nextInt();
        System.out.println("Informe um valor inteiro para N2: ");
        int num2 = entrada.nextInt();
       
        
        switch(opcao) {
            case 1: System.out.printf("A soma de %s e %s é: %s. \n", num1, num2, num1 + num2);
            break;
            case 2: System.out.printf("A multiplicação de %s e %s é: %s. \n", num1, num2, num1 * num2);
            break;
            case 3: System.out.printf("Finalizando programa... Volte sempre!\n");
            break;
            default: System.out.println("ERRO: Opção inválida. Tente novamente!");
        }
            
        entrada.close();
    }
    
}