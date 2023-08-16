/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03_exe010;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula03_Exe010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um valor para N1: ");
        float n1 = entrada.nextFloat();
        
        System.out.println("Informe um valor para N2: ");
        float n2 = entrada.nextFloat();
        
        // Processamento
        float mutiplicacao = n1 * n2;
        float divisao = n1 / n2;
                
        // Saída de dados        
        System.out.printf("\nA mutiplicação dos números: %s e %s é: %s.\n", n1, n2, mutiplicacao);
        System.out.printf("A divisão dos números: %s e %s é: %s.\n", n1, n2, divisao);
                
    }
    
}
