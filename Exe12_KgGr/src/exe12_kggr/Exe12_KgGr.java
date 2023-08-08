/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe12_kggr;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe12_KgGr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe a quantidade de alimentos em Kg: ");
        float kg = teclado.nextFloat();
        
        float conversorGr = (float) kg * 1000;
        
        float consumoDiario = (float) (conversorGr / 50);
        
        System.out.printf("Com 50gr por dia, %.0f kg serão consumidos em: %.2f dias.", kg, consumoDiario);
        
        
    }
    
}
