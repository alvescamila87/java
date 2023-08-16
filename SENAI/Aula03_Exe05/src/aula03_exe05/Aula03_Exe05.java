/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03_exe05;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula03_Exe05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o valor inteiro de N1: ");
        int n1 = entrada.nextInt();
        
        // Processamento
        int quadrado = n1*n1;
        
        // Saída de dados
        System.out.printf("O valor quadrado de %s é: %s.\n", n1, quadrado);
        
        
    }
    
}
