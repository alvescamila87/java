package aula26;

// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-25-a-27
public class ContaCorrente {

    int numeroConta;
    double saldo;
    boolean especial;
    double limiteEspecial;
    double valor;

    void getSaldo() {
        System.out.println("Saldo R$: " + saldo);
    }
    void sacar(double valor) {
        if(valor > saldo) {

            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo = this.saldo - valor;
            getSaldo();
        }
    }

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
        getSaldo();
    }
}
