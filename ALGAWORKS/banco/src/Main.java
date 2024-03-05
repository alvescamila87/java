public class Main {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.nome = "Princesa Isabel";
        titular1.documento = "6984989871919";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Maria Helena";

        Conta minhaConta = new Conta();
        minhaConta.titular = titular1;
        minhaConta.agencia = 123;
        minhaConta.numero = 9998;
        minhaConta.saldo = 15_000;

        System.out.println("Titular: " + minhaConta.titular.nome);
        System.out.println("Agência: " + minhaConta.agencia);
        System.out.println("Número: " + minhaConta.numero);
        System.out.println("Saldo: R$" + minhaConta.saldo);

        Conta suaConta = new Conta();
        suaConta.titular = titular2;
        suaConta.agencia = 658;
        suaConta.numero = 962651;
        suaConta.saldo = 10_000;

        System.out.println(suaConta.titular.nome);
    }
}
