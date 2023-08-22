/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03_exe013;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula03_Exe013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Celsius(Cº): ");
        float c = entrada.nextFloat();
        
        // Processamento
        float f = (c * 9/5) + 32;
        
        //Saída de dados
        System.out.printf("%s (Cº) convertidos para Fahrenheit são: %s (Fº).\n", c, f);
        
                
        
    }
    
}
