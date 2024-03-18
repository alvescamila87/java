package com.algaworks.banco.app;

import com.algaworks.banco.modelo.*;
import com.algaworks.banco.modelo.atm.CaixaEletronico;
import com.algaworks.banco.modelo.pagamento.Boleto;
import com.algaworks.banco.modelo.pagamento.DocumentoPagavel;
import com.algaworks.banco.modelo.pagamento.Holerite;

public class Main {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Princesa Isabel");
        titular1.setDocumento("6984989871919");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Helena");
        titular2.setDocumento("3655196159");

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 9998);

        System.out.println("Titular 1: " + minhaConta.getTitular().getNome());
        System.out.println("Agência: " + minhaConta.getAgencia());
        System.out.println("Número: " + minhaConta.getNumero());
        System.out.println("Saldo: R$" + minhaConta.getSaldo());

        ContaEspecial suaConta = new ContaEspecial(titular2, 658, 962651, 1_000);

        System.out.println("Titular 2: " + suaConta.getTitular().getNome());
        System.out.println("Agência: " + suaConta.getAgencia());
        System.out.println("Número: " + suaConta.getNumero());
        System.out.println("Saldo: R$" + suaConta.getSaldo());

        minhaConta.depositar(30_000);
        minhaConta.sacar(1_000);
        //minhaConta.sacar(500, 15);
        //minhaConta.creditarRendimentos(0.8);
        //minhaConta.debitarTarifaMensal();

        suaConta.depositar(30_000);
        suaConta.sacar(30_500);
        suaConta.debitarTarifaMensal();

        System.out.println("Saldo: R$" + minhaConta.getSaldo());
        System.out.println("Saldo: R$" + suaConta.getSaldo());

        //upcasting (coerção para cima) explicito da subclasse ContaInvestimento na super classe Conta
        //Conta conta = (Conta) minhaConta;

        //upcasting (coerção para cima) implícito
        //Conta conta2 = minhaConta;

        // polimorfismo
        CaixaEletronico ce = new CaixaEletronico();
        ce.imprimirSaldo(minhaConta);
        System.out.println("");
        ce.imprimirSaldo(suaConta);

        // Não permitir que classe abstrata seja instanciada, no caso Conta
        //Conta conta4 = new Conta(titular1, 6516161, 6169161);


        // interface boleto 1
        Boleto boletoEscola = new Boleto(titular1, 800);
        ce.pagar(boletoEscola, minhaConta);
        // interface 3 estornar pagamento
        ce.estornarPagamento(boletoEscola, minhaConta);
        //System.out.println("Boleto pago: " + boletoEscola.estaPago());
        boletoEscola.imprimirRecibo();

        // interface holerite 2
        Holerite salarioFuncionario = new Holerite(titular1, 100, 160);
        ce.pagar(salarioFuncionario, minhaConta);
        //System.out.println("Holerite pago: " + salarioFuncionario.estaPago());
        salarioFuncionario.imprimirRecibo();




    }
}
