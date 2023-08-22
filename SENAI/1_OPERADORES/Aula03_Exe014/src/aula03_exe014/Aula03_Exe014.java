/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03_exe014;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula03_Exe014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor a ser investido: R$");
        float valor = entrada.nextFloat();
        
        System.out.println("Informe o percentual da taxa de juros anual: ");
        float juros = entrada.nextFloat();
        
        System.out.println("Informe a quantidade de anos do investimento: ");
        float periodo = entrada.nextFloat();
        
        // Processamento
       float montante = valor * (1 + juros * periodo);
       
       // Saída de dados
        System.out.printf("O montante de final de R$%s em um investimento após %s anos é de: R$%s.\n", valor, periodo, montante);
    }
    
}
