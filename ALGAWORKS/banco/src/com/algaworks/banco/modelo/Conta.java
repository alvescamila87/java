package com.algaworks.banco.modelo;

import com.algaworks.banco.modelo.excecao.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Conta {
    private Pessoa titular;
    private int agencia;
    private int numero;
    private BigDecimal saldo = BigDecimal.ZERO;

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
    public void depositar(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Não são permitidos valores negativos.");
        }
        this.saldo.add(valor);

    }

    public void sacar(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Não são permitidos valores negativos.");
        }

        if(getSaldoDisponivel().subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo = saldo.subtract(valor);
    }

    // abstract (quem implementa são as subsclasses)
    public abstract void debitarTarifaMensal();

    // sobrecarga de método
    public void sacar(BigDecimal valor, BigDecimal taxaSaque) {
        // debitar da conta:
        sacar(valor.add(taxaSaque));
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


    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal getSaldoDisponivel() {
        return getSaldo();
    }

}
