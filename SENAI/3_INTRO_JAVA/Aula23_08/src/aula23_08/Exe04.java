
package aula23_08;

import java.util.Scanner;


public class Exe04 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o salário base do colaborador: ");
        float salarioBase = entrada.nextFloat();
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        float qtdHoras = entrada.nextFloat();
        
        // Processamento de dados
        float valorHora = salarioBase / qtdHoras;
        
        // Saída de dados
        System.out.printf("O colaborador tem valor hora de: %s.\n", valorHora);
        System.out.printf("Quantidade horas trabalhadas no mês: %shs.\n", qtdHoras);
        System.out.printf("Salário de R$%s mensais.\n", valorHora,salarioBase, qtdHoras);
        
        entrada.close();
    }
    
}
