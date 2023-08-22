/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe10_rendimentopoupanca;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe10_RendimentoPoupanca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe o valor do depósito: R$");
        float deposito = teclado.nextFloat();
        
        float rendimentoPoupanca = (float) (deposito * 1.05);
        
        System.out.printf("Valor depositado: R$%.2f. Rendimentos da aplicação na poupança: R$%.2f.", deposito, rendimentoPoupanca);
    }
    
}
