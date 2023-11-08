package aula33;

public class ContaCorrente {

    private int numeroConta;
    private double saldo;
    private boolean especial;
    private double limiteEspecial;
    private double valor;

    public ContaCorrente() {

    }
    public ContaCorrente(int numeroConta, double saldo, boolean especial, double limiteEspecial, double valor) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.especial = especial;
        this.limiteEspecial = limiteEspecial;
        this.valor = valor;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        System.out.println("Saldo R$: " + saldo);
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean sacar(double valor) {
        if(saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            if (especial) {
                double limite = limiteEspecial + saldo;
                if(limite >= valor) {
                    this.saldo = this.saldo - valor;
                    return true;
                } else {
                    return false;
                }
            } else {
                System.out.println("Saldo insuficiente!");
                return false;
            }
        }
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        getSaldo();
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public boolean verificarUsoChequeEspecial() {
        return saldo < 0;
    }
}
