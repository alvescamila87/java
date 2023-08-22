/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe09_reajustesalario;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe09_ReajusteSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe o salário atual do funcionário: ");
        float salarioAtual = teclado.nextFloat();
        
        float salarioNovo = (float) (salarioAtual * 1.15);
        
        System.out.printf("Salario atual: R$%.2f. Novo salário: R$%.2f.", salarioAtual, salarioNovo);
    }
    
}
