package com.algaworks.banco.modelo.excecao;
// exception: exceção checada: classe que herda exception: é obrigado a capturar e tratar
// exception: exceção NÃO checada: classe que herda run time exception: não é obrigado a capturar e tratar
public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
