package aula26;

public class TesteContaCorrente2 {
    public static void main(String[] args) {
        ContaCorrente2 contaCorrente1 = new ContaCorrente2();
        contaCorrente1.numeroConta = 12345;
        contaCorrente1.especial = true;
        contaCorrente1.limiteEspecial = 500;
        contaCorrente1.saldo = -10;

        System.out.println("Saldo: " + contaCorrente1.saldo);
        System.out.println("Limite especial: " + contaCorrente1.limiteEspecial);

        boolean saqueEfetuado = contaCorrente1.sacar(10);
        if(saqueEfetuado) {
            System.out.println("Saque efetuado: " + saqueEfetuado);
            System.out.println("Saldo: " + contaCorrente1.saldo);
        } else {
            System.out.println("Saque efetuado: " + saqueEfetuado);
            System.out.println("Saldo insuficiente");
        }


        saqueEfetuado = contaCorrente1.sacar(500);
        if(saqueEfetuado) {
            System.out.println("Saque efetuado: " + saqueEfetuado);
            System.out.println("Saldo: " + contaCorrente1.saldo);
        } else {
            System.out.println("Saque efetuado: " + saqueEfetuado);
            System.out.println("Saldo insuficiente");
        }

        contaCorrente1.depositar(500);
        System.out.println(contaCorrente1.saldo);

        contaCorrente1.consultarSaldo();

        if(contaCorrente1.verificarUsoChequeEspecial()) {
            System.out.println("Usando cheque especial");
        } else {
            System.out.println("NÃO está usando cheque especial");
        }

    }
}
