package aula26;

import java.sql.Struct;

// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-25-a-27
public class ContaCorrente2 {

    int numeroConta;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valorEspecialUsado;
    double valor;

    void getSaldo() {
        System.out.println("Saldo R$: " + saldo);
    }
    boolean sacar(double valor) {
        if(saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if(limite >= valor) {
                    this.saldo = this.saldo - valor;
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("Saldo insuficiente!");
                return false;
            }
        }
    }

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
        getSaldo();
    }

    void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }
}


