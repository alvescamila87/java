package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Banco;
import com.algaworks.banco.modelo.Conta;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class PrincipalStreamsAPI {

    public static void main(String[] args) {

        Banco banco = new Banco();

        // api para trabalhar com operações em massa em uma sequencia de elementos: streams API
        Stream<Conta> stream = banco.getContas().stream();

        // uso de filter da interface predicate
        Stream<Conta> stream2 = stream.filter(conta -> conta.getSaldo().compareTo(new BigDecimal("130")) > 0);

        stream2.forEach(conta -> {
            //conta.depositar(new BigDecimal("10"));
            System.out.println(conta.getAgencia() + "/" + conta.getNumero() + " = " + conta.getSaldo());
        });
    }
}
