package br.com.alura.banco.principal;

import br.com.alura.banco.modelos.Conta;

/**
 *
 * @author Camila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Abertura de conta
        
        Conta cliente1 = new Conta();
        cliente1.setConta(963258);
        cliente1.setNome("Julio Cesar");
        cliente1.setSaldo(0);
        cliente1.setLimite(15000);
        System.out.println("Conta corrente: " + cliente1.getConta());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Saldo R$: " + cliente1.getSaldo());
        System.out.println("Limite R$: " + cliente1.getLimite());
        
        // Depositar valor
        cliente1.deposita(896.36);
        
        // Sacar valor
        cliente1.saca(52.96);
        
        // Extrato da conta
        cliente1.extrato();
        
        // Criando nova conta
        Conta cliente2 = new Conta();
        cliente2.setConta(666325);
        cliente2.setNome("Isabel");
        cliente2.setSaldo(50.00);
        cliente2.setLimite(5000);
        System.out.println("Conta corrente: " + cliente2.getConta());
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Saldo R$: " + cliente2.getSaldo());
        System.out.println("Limite R$: " + cliente2.getLimite());
        
        // Transferindo valor de cliente 1 para cliente 2
        cliente1.transfere(650.90, cliente2);
        System.out.println(cliente1.extrato());
        System.out.println(cliente2.extrato());
        
        
    }
    
}
