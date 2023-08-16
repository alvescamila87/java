/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03_exe012;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula03_Exe012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        int i = 0;
        int media = 0;
        int soma = 0;
        while (i < 5) {
            System.out.printf("Informe o valor inteiro de N%s: ", i+1);
            int num = entrada.nextInt();
            soma += num;
            i += 1;            
        }
        
        // Cálculo de dados
        media = soma / i;
        
        // Saída de dados
        System.out.printf("Foram digitados %s números. \nA soma desses números é: %s. \nA média desses números é: %s.\n", i, soma, media);
        
        
        
    }
    
}
