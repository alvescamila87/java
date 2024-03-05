public class Main {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.nome = "Princesa Isabel";
        titular1.documento = "6984989871919";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Maria Helena";
        titular2.documento = "3655196159";

        Conta minhaConta = new Conta(titular1, 123, 9998);
//        minhaConta.titular = titular1;
//        minhaConta.agencia = 123;
//        minhaConta.numero = 9998;
        //minhaConta.saldo = 15_000;


        System.out.println("Titular 1: " + minhaConta.titular.nome);
        System.out.println("Agência: " + minhaConta.agencia);
        System.out.println("Número: " + minhaConta.numero);
        System.out.println("Saldo: R$" + minhaConta.saldo);

        Conta suaConta = new Conta();
        suaConta.titular = titular2;
        suaConta.agencia = 658;
        suaConta.numero = 962651;
        //suaConta.saldo = 30_000;


        System.out.println("Titular 2: " + suaConta.titular.nome);
        System.out.println("Agência: " + suaConta.agencia);
        System.out.println("Número: " + suaConta.numero);
        System.out.println("Saldo: R$" + suaConta.saldo);

        minhaConta.depositar(15_000);
        suaConta.depositar(30_000);
        minhaConta.sacar(1_000);
        minhaConta.sacar(500, 15);

        System.out.println("Saldo: R$" + minhaConta.saldo);
        System.out.println("Saldo: R$" + suaConta.saldo);


    }
}
