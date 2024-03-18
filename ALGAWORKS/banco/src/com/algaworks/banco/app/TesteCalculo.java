package com.algaworks.banco.app;

import java.math.BigDecimal;

public class TesteCalculo {

    public static void main(String[] args) {

        // Padrão: IEEE 754-2019: representação binária de ponto flutuante
        /*
        double x = 1.0;

        x = x - 0.10;
        x = x - 0.20;
        x = x - 0.30;

        System.out.println(x);
        */

        // cálculos monetários, onde precisa-se de precisão, recomenda-se:
        // não usar double nem float
        BigDecimal x = new BigDecimal("1.0");

        x = x.subtract(new BigDecimal("0.10"));
        x = x.subtract(new BigDecimal("0.20"));
        x = x.subtract(new BigDecimal("0.30"));

        System.out.println(x);
    }
}
