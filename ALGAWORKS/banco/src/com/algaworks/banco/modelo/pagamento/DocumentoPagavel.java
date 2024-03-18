package com.algaworks.banco.modelo.pagamento;

import java.math.BigDecimal;

public interface DocumentoPagavel {

    // estabelecer contrato (interface)
    // automaticamente os métodos já são public and abstract
    // public abstract double getValorTotal();

    BigDecimal getValorTotal();
    boolean estaPago();
    void quitarPagamento();

    default void imprimirRecibo(){
        System.out.println("RECIBO:");
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Pago: " + estaPago());
    }
}
