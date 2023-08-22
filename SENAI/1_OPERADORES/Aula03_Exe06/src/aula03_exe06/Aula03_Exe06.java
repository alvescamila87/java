/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03_exe06;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula03_Exe06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um valor inteiro para N1: ");
        int n1 = entrada.nextInt();
        
        System.out.println("Informe um valor inteiro para N2: ");
        int n2 = entrada.nextInt();
        
        // Processamento de dados
        int quadrado = (n1*n1) + (n2*n2);
        
        // Saída de dados
        System.out.printf("A soma do quadrdado desses dois números: %s e %s é: %s.\n", n1, n2, quadrado);
    }
    
}
