package com.algaworks.banco.modelo;

public class CaixaEletronico {

    // ao invés de ContaInvestimento, manter o super tipo "Conta" no parâmetro
    public void imprimirSaldo(Conta conta) {
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponível: " + conta.getSaldoDisponivel());
    }
}
