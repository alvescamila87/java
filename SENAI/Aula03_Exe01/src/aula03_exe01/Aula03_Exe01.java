/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03_exe01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula03_Exe01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados:
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor inteiro de N1: ");
        int n1 = entrada.nextInt();
        
        System.out.println("Informe o valor inteiro de N2: ");
        int n2 = entrada.nextInt();
        
        // Processamento
        int soma = n1 + n2;
        
        // Saída de dados
        System.out.printf("A soma dos números: %s e %s é: %s. \n", n1, n2, soma);
                
                
        
        
    }
    
}
