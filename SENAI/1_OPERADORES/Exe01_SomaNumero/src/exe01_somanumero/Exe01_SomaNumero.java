/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe01_somanumero;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe01_SomaNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe um valor para o número 1: ");
        int num1 = teclado.nextInt();
        
        System.out.println("Informe um valor para o número 2: ");
        int num2 = teclado.nextInt();
        
        int soma = num1 + num2;
                
        System.out.printf("A soma entre os números: %s e %s é: %s.", num1, num2, soma);
    }
    
}
