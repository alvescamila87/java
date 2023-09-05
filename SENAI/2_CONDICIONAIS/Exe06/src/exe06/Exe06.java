
package exe06;

import java.util.Scanner;


public class Exe06 {


    public static void main(String[] args) {
        // Entrada de dados
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        float qtdHoras = entrada.nextFloat();
        
        System.out.println("Informe o valor hora do colaborador: ");
        float valorHora = entrada.nextFloat();
        
        // Processamento de dados
        float resto = qtdHoras % 160;
        float hora_extra = (float) (resto * valorHora * (1.50));
        
        if (qtdHoras > 160) {
            float salario;
            salario = 0;
            salario = hora_extra + (qtdHoras - resto) * valorHora;
            System.out.printf("Total de horas trabalhadas no mês: %s, sendo %shs extras. Salário do mês: R$%s.\n", qtdHoras, resto, salario);
        }
        else {
            float salario;
            salario = qtdHoras * valorHora;
            System.out.printf("Total de horas trabalhadas no mês: %s. Salário do mês: R$%s.\n", qtdHoras, salario);
        }   
        
    }
    
}
