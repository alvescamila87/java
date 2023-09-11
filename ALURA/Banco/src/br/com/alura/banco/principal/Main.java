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
        cliente1.setNumero(963258);
        cliente1.setNome("Julio Cesar");
        cliente1.setSaldo(0);
        cliente1.setLimite(15000);
        System.out.println("Conta corrente: " + cliente1.getNumero());
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Saldo R$: " + cliente1.getSaldo());
        System.out.println("Limite R$: " + cliente1.getLimite());
        
        // Depositar valor
        cliente1.deposita(896.36);
        
        // Sacar valor
        cliente1.saca(52.96);
        
        // Extrato da conta
        cliente1.extrato();
        
    }
    
}
