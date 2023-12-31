package exercicios.aula43.e01;

public class Teste {

    public static void main(String[] args) {

        System.out.println("*** Conta corrente ***");
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente conta simples");
        contaSimples.setNumConta("8697-85");

        contaSimples.depositar(100);
        realizarSaque(contaSimples,50);
        realizarSaque(contaSimples,70);

        System.out.println(contaSimples);

        System.out.println("*** Conta poupança ***");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setNomeCliente("Cliente conta poupança");
        contaPoupanca.setNumConta("63264-77");
        contaPoupanca.setDiaRendimento(10);

        contaPoupanca.depositar(100);
        realizarSaque(contaPoupanca,50);
        realizarSaque(contaPoupanca,70);

        if(contaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
        } else {
            System.out.println("Hoje não é dia de rendimento, novo saldo não calculado.");
        }

        System.out.println(contaPoupanca);

        System.out.println("*** Conta especial ***");
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente conta especial");
        contaEspecial.setNumConta("58974-77");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);
        realizarSaque(contaEspecial,50);
        realizarSaque(contaEspecial,70);

        System.out.println(contaEspecial);
    }

    public static void realizarSaque(ContaBancaria conta, double valor) {
        if(conta.sacar(valor)) {
            System.out.println("Saque realizado!" + conta.getSaldo());
        } else {
            System.out.println("Saldo infusiciente para saque de: " + valor + " saldo de: " + conta.getSaldo() );
        }
    }
}
