
package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe08 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Informe a idade: ");
        int idade = entrada.nextInt();
        System.out.println("Informe o sexo [M/F]: ");
        char sexo = entrada.next().charAt(0);
        System.out.println("Informe o salário mensal R$: ");
        float salario = entrada.nextFloat();
        
        // Processamento e saída de dados
        if (sexo == 'M' && idade >= 30) {
            System.out.println("Você recebeu abono!");
            System.out.printf("Salário anterior: R$%.2f -> Novo salário: R$%.2f.\n", salario, salario + 100);
        } else if (sexo == 'M' && idade < 30) {
            System.out.println("Você recebeu abono!");
            System.out.printf("Salário anterior: R$%.2f -> Novo salário: R$%.2f.\n", salario, salario + 50);
        } else if (sexo == 'F' && idade >= 30) {
            System.out.println("Você recebeu abono!");
            System.out.printf("Salário anterior: R$%.2f -> Novo salário: R$%.2f.\n", salario, salario + 200);
        } else if (sexo == 'F' && idade < 30) {
            System.out.println("Você recebeu abono!");
            System.out.printf("Salário anterior: R$%.2f -> Novo salário: R$%.2f.\n", salario, salario + 80);
        }           
        entrada.close();
    }
    
}
