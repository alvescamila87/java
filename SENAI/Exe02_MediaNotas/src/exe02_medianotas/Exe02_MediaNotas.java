/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe02_medianotas;

import java.util.Scanner;

/**5
 * 6
 *
 * @author Camila
 */
public class Exe02_MediaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe a nota 1: ");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Informe a nota 2: ");
        float nota2 = teclado.nextFloat();
        
        System.out.println("Informe a nota 3: ");
        float nota3 = teclado.nextFloat();
        
        System.out.println("Informe a nota 4: ");
        float nota4 = teclado.nextFloat();
        
        float media = (nota1 + nota2 + nota3 + nota4) / 4;
                
        System.out.printf("A média das notas: %s, %s, %s, %s é: %s.", nota1, nota2, nota3, nota4, media);
      
        
    }
    
}
