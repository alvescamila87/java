
package operadoresCondicionais;

import java.util.Scanner;


public class Exe03 {
    public static void main(String[] args) {
        
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe um valor inteiro para N1: ");
        int valor1 = entrada.nextInt();
        System.out.println("Informe um valor inteiro para N2: ");
        int valor2 = entrada .nextInt();
        
        // Processamento de dados
        int soma = valor1 + valor2;
        int sub = valor1 - valor2;
        int div = valor1 / valor2;
        int mul = valor1 * valor2;
        
        // Saída de dados
        System.out.printf("Números informados: %s e %s. \n", valor1, valor2);
        System.out.printf("Resultado soma: %s. \n", soma);
        System.out.printf("Resultado subtração: %s \n", sub);
        System.out.printf("Resultado divisão: %s. \n", div);
        System.out.printf("Resultado multiplicação: %s. \n", mul);
        
        entrada.close();
        
    }
            
    
}
