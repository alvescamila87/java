package com.algaworks.banco.modelo.pagamento;

public interface DocumentoPagavel {

    // estabelecer contrato (interface)
    // automaticamente os métodos já são public and abstract
    // public abstract double getValorTotal();

    double getValorTotal();
    boolean estaPago();
    void quitarPagamento();

    default void imprimirRecibo(){
        System.out.println("RECIBO:");
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Pago: " + estaPago());
    }
}
