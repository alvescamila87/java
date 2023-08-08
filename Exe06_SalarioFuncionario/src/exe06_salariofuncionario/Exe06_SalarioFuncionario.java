/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe06_salariofuncionario;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe06_SalarioFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Informe o valor hora do funcionário: ");
        float valorHora = teclado.nextFloat();
        
        System.out.println("Informe a quantidade de horas trabalhadas");
        int qtdHoras = teclado.nextInt();
        
        float salario = valorHora * qtdHoras;
        
        System.out.printf("Com 'valor hora' de: R$%.2f e %s hora(s) trabalhadas, o salário do mês é R$%.2f.", valorHora, qtdHoras, salario);
    }
    
}
