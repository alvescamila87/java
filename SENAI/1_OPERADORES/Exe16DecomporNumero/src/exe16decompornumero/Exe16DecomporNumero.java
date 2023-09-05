/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe16decompornumero;

/**
 *
 * @author Camila
 */
public class Exe16DecomporNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 1738;
        
        int milhar =  num / 1000;
        System.out.printf("\nMilhar: %s", milhar);
        int centena = num % 1000;
        centena = centena / 100; 
        System.out.printf("\nCentena: %s", centena);
        int dezena = num % 100;
        dezena = dezena / 10;
        System.out.printf("\nDezena: %s", dezena);
        int unidade = num % 10;
        System.out.printf("\nUnidade: %s\n", unidade);
        
        
    }
    
}
