package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.ContaEspecial;
import com.algaworks.banco.modelo.ContaInvestimento;
import com.algaworks.banco.modelo.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Princesa Isabel");
        titular1.setDocumento("6984989871919");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Helena");
        titular2.setDocumento("3655196159");

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 9998);

        System.out.println("Titular 1: " + minhaConta.getTitular().getNome());
        System.out.println("Agência: " + minhaConta.getAgencia());
        System.out.println("Número: " + minhaConta.getNumero());
        System.out.println("Saldo: R$" + minhaConta.getSaldo());

        ContaEspecial suaConta = new ContaEspecial(titular2, 658, 962651, 1_000);

        System.out.println("Titular 2: " + suaConta.getTitular().getNome());
        System.out.println("Agência: " + suaConta.getAgencia());
        System.out.println("Número: " + suaConta.getNumero());
        System.out.println("Saldo: R$" + suaConta.getSaldo());

        //minhaConta.depositar(15_000);
        suaConta.depositar(30_000);
        suaConta.sacar(31_500);
        //minhaConta.sacar(1_000);
        //minhaConta.sacar(500, 15);
        //minhaConta.creditarRendimentos(0.8);


        System.out.println("Saldo: R$" + minhaConta.getSaldo());
        System.out.println("Saldo: R$" + suaConta.getSaldo());


    }
}
