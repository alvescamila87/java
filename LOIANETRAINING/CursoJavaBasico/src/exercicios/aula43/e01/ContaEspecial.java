package exercicios.aula43.e01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(String nomeCliente, String numConta, int saldo, double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    /*@Override
    public void sacar(double valor) {
       double limiteEspecial = limite + getSaldo();

       if(limiteEspecial >= valor) {
           super.getSaldo() = super.getSaldo() + valor;
       } else {
           System.out.println("Saldo insuficiente");
       }
    }*/
}
