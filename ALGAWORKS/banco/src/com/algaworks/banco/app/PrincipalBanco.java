package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Banco;
import com.algaworks.banco.modelo.Conta;

import java.util.Comparator;
import java.util.function.ToIntFunction;

public class PrincipalBanco {

    public static void main(String[] args) {

        Banco banco = new Banco();

        // ordenação numérica (forma burocrática) - modo 1
        banco.getContas().sort(Comparator.comparingInt(new NumeroIntFunction()));

        // ordenação numérica (forma NÃO burocrática) - modo 2

        // lambda expression (programação funcional)
        ToIntFunction<Conta> function = (Conta conta) -> {
            return conta.getNumero();
        };

        banco.getContas().sort(Comparator.comparingInt(function));

        // sintaxe mais enxuta - modo 3
        banco.getContas().sort(Comparator.comparingInt(conta -> conta.getNumero()));

        // method reference (tipo especial de expressão lambda) - modo 4 (referenciando método, sem chamar)
        banco.getContas().sort(Comparator.comparingInt(Conta::getNumero));

        for (Conta conta : banco.getContas()) {
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());
        }
    }
}
