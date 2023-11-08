package operadoresCondicionais;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {
        /* 
            Exercício 02 - Desenvolva um algoritmo que simule a abertura de uma conta bancária cujo
            saldo inicial é zero. A seguir, simule um deposito de um valor qualquer e mostre o
            saldo atual. Depois disso, simule uma retirada(débito), qualquer e apresente o
            saldo final.
         */

        // Entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Você deseja abrir uma conta em nosso Banco XPTO? [S/N]");
        char caracter = entrada.next().charAt(0);

        // Abertura de conta
        float saldo  = 0f;
        
        if (caracter == 'S') {
            System.out.println("Sim, eu quero!");
            System.out.println("Ok, abertura de conta realizada com sucesso!");
            
            System.out.printf("Saldo inicial: R$%.2f\n", saldo);  
            
            // Movimentação de conta (depósito)
            System.out.println("Informe o valor que deseja DEPOSITAR: R$");
            float deposito = entrada.nextFloat();

            System.out.printf("+ Depósito de R$%.2f realizado com sucesso!\n", deposito);
            saldo = 0;
            saldo = deposito;
            System.out.printf("****** Saldo atual: R$%.2f.****** \n", saldo);
            
            // Movimentação de conta (saque)
            System.out.println("Informa o valor que deseja SACAR: R$");
            float saque = entrada.nextFloat();
            
            System.out.printf(" - Saque de R$%.2f realizado com sucesso!\n", saque);
            saldo = saldo - saque;
            System.out.printf("****** Saldo atual: R$%.2f.****** \n", saldo);
        } 
        // Não abertura de conta
        else {
            System.out.println("Não, obrigada!");
            System.out.println("Até logo! Banco XPTO"); 
        }
        
        
        // Fechamento de Scanner
        entrada.close();
    }
}
