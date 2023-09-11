package br.com.alura.banco.modelos;

/**
 *
 * @author Camila
 */
public class Conta extends Cliente {
    private long conta;
    private double saldo;
    private double limite;
    
    // Getters e Setters

    public long getConta() {
        return conta;
    }

    public void setConta(long conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    // Métodos
    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Saldo atualizado: R$" + saldo);
    }
    
    public void saca(double valor) {
        if (valor > saldo)  {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            this.saldo -= valor;
            System.out.println("Saldo atualizado: R$" + saldo);
        }
    }
    
    public double extrato() {
        return saldo;      
    }
    
    public void transfere(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.saldo += valor;
    }
    
}
