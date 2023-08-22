/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe11_quocienteresto;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe11_QuocienteResto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe um valor: ");
        int num = teclado.nextInt();
        
        int quociente = num / 3;
        int resto = num % 3;
        System.out.printf("Número informado: %s, Quociente da divisão por 3: %s, Resto da divisão por 3: %s.", num, quociente, resto );
        
    }
    
}
