package com.algaworks.banco.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    @Override
    public void debitarTarifaMensal() {
        if(getSaldo().compareTo(new BigDecimal("10000")) < 0) {
            sacar(new BigDecimal("30"));
        }
    }

    public void creditarRendimentos(BigDecimal percentualJuros) {
        BigDecimal valorRendimentos = getSaldo().multiply(percentualJuros).divide(new BigDecimal("100"), 2, RoundingMode.HALF_EVEN);
        //double valorRendimentos = getSaldo() * percentualJuros / 100;
        depositar(valorRendimentos);

        // 2.524 = 2.52
        // 2.526 = 2.53
        // 2.525 = 2.53
    }
}
