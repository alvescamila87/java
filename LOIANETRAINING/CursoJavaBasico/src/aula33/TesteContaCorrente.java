package aula33;

public class TesteContaCorrente {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();
        conta.setNumeroConta(12345646);
        conta.setEspecial(true);
        conta.setLimiteEspecial(500.22);
        conta.setSaldo(1000.89);

        System.out.println("Saldo na conta R$" + conta.getSaldo());
        System.out.println("Conta nº: " + conta.getNumeroConta());
        System.out.println("É conta especial: " + conta.isEspecial());
    }
}
