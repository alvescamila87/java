package exercicios.aula43.e01;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public Boolean sacar(double valor) {
       double saldoComLimite = limite + getSaldo();

       if((saldoComLimite - valor) >=0) {
           this.setSaldo(this.getSaldo() - valor);
           return true;
       } else {
           System.out.println("Saldo insuficiente");
           return false;
       }
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                "} " + super.toString();
    }
}
