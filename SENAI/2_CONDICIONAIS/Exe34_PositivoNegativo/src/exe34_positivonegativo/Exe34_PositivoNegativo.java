/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe34_positivonegativo;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe34_PositivoNegativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe um valor inteiro: ");
        int num = entrada.nextInt();

        if (num == 0) {
            System.out.println("O número informado é ZERO!");
        } else if (num > 0 ) {
            System.out.println("O número informado é POSITIVO!");
        } else {
            System.out.println("O número informado é NEGATIVO!");
        }
            
        entrada.close();
    }
    
}
