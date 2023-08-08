/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe08_conversorkm;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe08_ConversorKm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe quantas milhas deseja converter: ");
        float milhas = teclado.nextFloat();
        
        float conversorKm = (float) ((float) milhas / 1.60934);
        
        System.out.printf("%.2f milha(s) possuem %.4f km(s)", milhas, conversorKm);
        
    }
    
}
