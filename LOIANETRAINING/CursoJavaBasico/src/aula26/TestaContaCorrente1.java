package aula26;

public class TestaContaCorrente1 {

    public static void main(String[] args) {

        ContaCorrente contaCorrente1 = new ContaCorrente();

        contaCorrente1.numeroConta = 123456;
        contaCorrente1.saldo = 500.00;
        contaCorrente1.especial = true;

        contaCorrente1.getSaldo();
        contaCorrente1.sacar(1500);
        contaCorrente1.sacar(333);

        contaCorrente1.depositar(1500.25);
    }
}
