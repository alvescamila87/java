package br.com.alura.banco.modelos;

/**
 *
 * @author Camila
 */
public class Conta {
    String nome;
    long numero;
    double saldo;
    double limite;
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
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
    
}
