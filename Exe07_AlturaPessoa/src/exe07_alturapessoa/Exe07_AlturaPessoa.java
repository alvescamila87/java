/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe07_alturapessoa;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe07_AlturaPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe a altura da pessoa: ");
        float altura = teclado.nextFloat();
        
        float pesoIdeal = (float) ((72.7 * altura) - 58);
        
        System.out.printf("O peso ideal para uma pessoa de %.2f de altura é de: %.2f.", altura, pesoIdeal);
        
        
    }
    
}
