
package operadoresCondicionais;

import java.util.Scanner;


public class Exe07 {
    public static void main(String[] args) {
        // Emtrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o valor do saldo R$");
        float saldo = entrada.nextFloat();
        
        // Processamento da dados
        float valorReajuste = (float) ((saldo * 1.18) / 100);
        float saldoFinal = saldo + valorReajuste;
        
        // Saída de dados
        System.out.printf("Saldo inicial: R$%.2f.\n", saldo);
        System.out.printf("Valor reajustado: %.2f\n", saldo, valorReajuste);
        System.out.printf("Saldo reajustado: R$%.2f\n", saldoFinal);
        
        entrada.close();
        
    }
    
}
