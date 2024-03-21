package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Banco;
import com.algaworks.banco.modelo.Conta;
import com.algaworks.banco.modelo.Pessoa;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrincipalStreamsAPI {

    public static void main(String[] args) {

        Banco banco = new Banco();

        // contiguração de pipeline
        /*
        // forma 1 - contas
        // api para trabalhar com operações em massa em uma sequência de elementos: streams API
        Stream<Conta> stream = banco.getContas().stream();

        // uso de filter da interface predicate: filtrar elementos da condição lambda
        Stream<Conta> stream2 = stream.filter(conta -> conta.getSaldo().compareTo(new BigDecimal("130")) > 0);

        // filtrar contas que o número seja maior que 300
        Stream<Conta> stream3 = stream2.filter(conta -> conta.getNumero() > 300);

        // operação terminal para chamar a pipeline lazy do stream em cadeia
        stream3.forEach(conta -> {
            //conta.depositar(new BigDecimal("10"));
            System.out.println(conta.getAgencia() + "/" + conta.getNumero() + " = " + conta.getSaldo());
        });
        */

        // forma 2 - contas
        // forma enxuta do mesmo código acima de pipeline:
        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .sorted(Comparator.comparingInt(Conta::getNumero))
                .forEach(conta -> {
                    System.out.println(conta.getAgencia() + "/" + conta.getNumero() + " = " + conta.getSaldo());
                });

        // forma 3 - titulares das contas
        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .map(Conta::getTitular)
                .distinct()
                .forEach(System.out::println);

        // Operação de redução - saldo total de todas as contas que o banco possui
        BigDecimal saldoTotal = banco.getContas().stream()
                .map(Conta::getSaldo)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(saldoTotal);

        // Operação de terminal - Transformar uma lista de pessoas titulares
        List<Pessoa> titulares = banco.getContas().stream()
                .map(Conta::getTitular)
                .distinct()
                        .toList();
        //        .collect(Collectors.toList());

        System.out.println(titulares);

    }
}
