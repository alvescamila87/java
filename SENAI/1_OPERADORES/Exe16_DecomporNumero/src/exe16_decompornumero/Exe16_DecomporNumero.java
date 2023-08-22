/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe16_decompornumero;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe16_DecomporNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num = 1738;
        
        // obter milhar
        int milhar = num / 1000;
        
        //obter centena
        int centena = (num % 1000); 
        centena = centena / 100;
        
        
        //obter dezena
        int dezena = (num % 100); 
        dezena = dezena / 10;
                
        //obter centena
        int unidade = num % 10;
          
        
        // Saída de dados
        System.out.printf("\nMilhar: %s", milhar);
        System.out.printf("\nCentena: %s", centena);
        System.out.printf("\nDezena: %s", dezena);
        System.out.printf("\nUnidade: %s\n", unidade);    
    }
    
    
}
