package desafio_contabancaria;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dados do cliente
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome do cliente da conta: ");
        String nome = entrada.nextLine();
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        
        System.out.println("*******************");
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + tipoConta);
        System.out.println("Saldo R$" + saldo);
        System.out.println("*******************");
        
        // Menu de opções 
        int opcao = 0;
        String menu = """
                      Selecione uma operação:
                      [1] Consultar saldo
                      [2] Depositar valor
                      [3] Sacar valor
                      [4] Sair
                      """;
        
        while(opcao != 4){
            System.out.println(menu);
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1: 
                    System.out.println("Saldo atualizado R$" + saldo);
                break;
                case 2:
                    System.out.println("Informe o valor de depósito R$");
                    double deposito = entrada.nextDouble();
                    saldo = saldo + deposito;
                    System.out.printf("Depósito R$%.2f Saldo atualizado R$%.2f. \n", deposito, saldo);
                break;
                case 3:
                    System.out.println("Informe o valor de transferência R$");
                    double saque = entrada.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente! Saldo R$" + saldo);
                    } else {
                        saldo = saldo - saque;
                        System.out.printf("Saque de R$%.2f Saldo atualizado R$%.2f. \n", saque, saldo);
                    }
                break;
                case 4:
                    System.out.println("Saindo da conta corrente! Obrigada, volte sempre!");
                break;
                default: System.out.println("ERRO: Opção inválida. Tente novamente!");
               
            }
            
        }
        
        
        entrada.close();
    }
    
}
