package com.algaworks.banco.app;

import com.algaworks.banco.modelo.Conta;

import java.util.function.ToIntFunction;

public class NumeroIntFunction implements ToIntFunction<Conta> {

    @Override
    public int applyAsInt(Conta conta) {
        return conta.getNumero();
    }
}
