/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03_exe011;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula03_Exe011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        int i = 0;
        float totalRenda = 0;
        int qtdFilhosTotal = 0;
        float mediaRenda = 0;
        int mediaQtdFilhos = 0;
        
        while (i < 5) {
            System.out.printf("Informe a renda familiar do 'Habitante %s': R$", i+1);
            float renda = entrada.nextFloat();
            System.out.printf("Informe a quantidade de filhos do 'Habitante %s': ", i+1);
            int qtdFilhos = entrada.nextInt();
            i = i + 1;
            totalRenda += renda;
            qtdFilhosTotal += qtdFilhos;
        }
            
            // Processamento
            mediaRenda = totalRenda / i;
            mediaQtdFilhos = qtdFilhosTotal / i;
            
            
            // Saída de dados
            System.out.printf("\n Foram entrevistados %s habitantes da população da cidade como amostra da pesquisa.", i);
            System.out.printf("\n A média do salário da população é de: R$%s.", i , mediaRenda);
            System.out.printf("\n A média de filhos da população de: %s.\n" , i , mediaQtdFilhos);
    }

    
}
