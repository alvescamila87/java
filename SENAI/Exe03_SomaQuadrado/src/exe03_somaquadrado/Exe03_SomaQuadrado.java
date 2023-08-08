/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe03_somaquadrado;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe03_SomaQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe um valor para N1: ");
        int n1 = teclado.nextInt();
        
        System.out.println("Informe um valor para N2: ");
        int n2 = teclado.nextInt();
        
        int soma = (n1 * n1) + (n2 * n2);
        
        System.out.printf("A soma do quadrado dos números: %s e %s é: %s.", n1, n2, soma);
        
        
    }
    
}
