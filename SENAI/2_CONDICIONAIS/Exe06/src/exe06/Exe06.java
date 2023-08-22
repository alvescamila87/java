
package exe06;

import java.util.Scanner;


public class Exe06 {


    public static void main(String[] args) {
        // Entrada de dados
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        float qtd_horas = entrada.nextFloat();
        
        System.out.println("Informe o valor hora do colaborador: ");
        float valor_hora = entrada.nextFloat();
        
        // Processamento de dados
        float resto = qtd_horas % 160;
        float hora_extra = (float) (resto * valor_hora * (1.50));
        
        if (qtd_horas > 160) {
            float salario;
            salario = 0;
            salario = hora_extra + (qtd_horas - resto) * valor_hora;
            System.out.printf("Total de horas trabalhadas no mês: %s, sendo %shs extras. Salário do mês: R$%s.\n", qtd_horas, resto, salario);
        }
        else {
            float salario;
            salario = qtd_horas * valor_hora;
            System.out.printf("Total de horas trabalhadas no mês: %s. Salário do mês: R$%s.\n", qtd_horas, salario);
        }   
        
    }
    
}
