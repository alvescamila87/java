public class Main {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();
        minhaConta.nomeTitular = "Princesa Isabel";
        minhaConta.agencia = 123;
        minhaConta.numero = 9998;
        minhaConta.saldo = 15_000;

        System.out.println("Titular: " + minhaConta.nomeTitular);

    }
}
