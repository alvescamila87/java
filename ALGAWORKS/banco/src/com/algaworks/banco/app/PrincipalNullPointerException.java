package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Banco;
import com.algaworks.banco.modelo.Conta;

import java.math.BigDecimal;
import java.util.Optional;

public class PrincipalNullPointerException {
    public static void main(String[] args) {

        // se proteger da null pointer exception

        Banco banco = new Banco();

        // método padrão de verificação
        //Conta contaEncontrada  = banco.buscar(123, 222);
        //if(contaEncontrada != null) {
        //    System.out.println(contaEncontrada.getSaldo());
        //}

        // método com Optional - forma 1
        Optional<Conta> contaOptional = banco.buscar(123, 222);

        /*if(contaOptional.isPresent()) {
            Conta contaEncontrada = contaOptional.get();
            System.out.println(contaEncontrada.getSaldo());
        }*/

        // método com Optional - forma 2
        contaOptional.ifPresent(conta -> System.out.println(conta.getSaldo()));

        // método com Optional - forma 3
        banco.buscar(123, 222)
                .ifPresent(conta -> System.out.println(conta.getSaldo()));

        // método com Optional - forma 4
        Conta conta = banco.buscar(123,222)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));

        System.out.println(conta.getSaldo());

        // método com Optional - forma 5: pegar o saldo e atribuir ao BigDecimal
        // senão existir, retorna zero.
        BigDecimal saldo = banco.buscar(123,333)
                .map(Conta::getSaldo)
                .orElse(BigDecimal.ZERO);

        System.out.println(saldo);

    }
}
