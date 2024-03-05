import java.util.Objects;

public class Conta {
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    // construtor

    Conta() {

    }

    Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular);

        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }



    // métodos
    void depositar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Não são permitidos valores negativos.");
        }
        this.saldo += valor;

    }

    void sacar(double valor) {
        if(valor <= 0) {
            throw new IllegalArgumentException("Não são permitidos valores negativos.");
        }

        if(saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo -= valor;
    }

    // sobrecarga de método
    void sacar(double valor, double taxaSaque) {
        // debitar da conta:
        sacar(valor + taxaSaque);
    }

}
