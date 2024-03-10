package com.algaworks.banco.modelo;

import java.util.Objects;

public class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    // construtor

    Conta() {

    }

    public Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular);

        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }



    // métodos
    public void depositar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Não são permitidos valores negativos.");
        }
        this.saldo += valor;

    }

    public void sacar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Não são permitidos valores negativos.");
        }

        if(getSaldoDisponivel() - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    // sobrecarga de método
    public void sacar(double valor, double taxaSaque) {
        // debitar da conta:
        sacar(valor + taxaSaque);
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }

    public double getSaldoDisponivel() {
        return getSaldo();
    }

}
