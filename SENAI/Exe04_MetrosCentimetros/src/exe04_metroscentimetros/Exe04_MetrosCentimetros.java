/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe04_metroscentimetros;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe04_MetrosCentimetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe quantos metros deseja converter: ");
        float metros = teclado.nextFloat();
        
        float conversorCentimetros = metros * 100;
        
        System.out.printf("%s (m) metros são %s (cm) centrímetros.", metros, conversorCentimetros);
        
        
    }
    
}
