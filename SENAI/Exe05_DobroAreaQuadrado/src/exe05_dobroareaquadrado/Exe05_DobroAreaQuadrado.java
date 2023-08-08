/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe05_dobroareaquadrado;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe05_DobroAreaQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe o tamanho do 'lado do quadrado': ");
        float ladoQuadrado = teclado.nextFloat();
        
        float areaQuadrado = ladoQuadrado * ladoQuadrado;
        
        float dobroArea = areaQuadrado * 2;
        
        System.out.printf("Lado do quadrado: %s, área do quadrado: %s, dobro da área do quadrado: %s.", ladoQuadrado, areaQuadrado, dobroArea);
    }
    
}
