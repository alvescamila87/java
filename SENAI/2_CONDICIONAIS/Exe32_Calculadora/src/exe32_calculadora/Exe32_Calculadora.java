/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe32_calculadora;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe32_Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Selecine uma opção do menu: ");
        System.out.println("Opção [1]: SOMA");
        System.out.println("Opção [2]: SUBTRAÇÃO");
        System.out.println("Opção [3]: MULTIPLICAÇÃO");
        System.out.println("Opção [4]: DIVISÃO");
        int opcao = entrada.nextInt();
        System.out.println("Informe um valor inteiro para N1: ");
        int num1 = entrada.nextInt();
        System.out.println("Informe um valor inteiro para N2: ");
        int num2 = entrada.nextInt();
        
        switch(opcao) {
            case 1: System.out.printf("A soma de %s e %s é: %s. \n", num1, num2, num1 + num2);
            break;
            case 2: System.out.printf("A subtração de %s e %s é: %s. \n", num1, num2, num1 - num2);
            break;
            case 3: System.out.printf("A multiplicação de %s e %s é: %s. \n", num1, num2, num1 * num2);
            break;
            case 4: 
                if (num2 == 0) {
                System.out.println("ERRO: Não é possível realizar divisão por ZERO.");
                }
                else {
                System.out.printf("A divisão de %s e %s é: %s. \n", num1, num2, num1 / num2);
                }
            break;
            default: System.out.println("ERRO: Opção inválida. Tente novamente!");
        }
            
        entrada.close();
    }
    
}
