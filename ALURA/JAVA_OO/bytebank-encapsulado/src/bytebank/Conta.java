package bytebank;


/**
 *
 * @author Camila
 */
public class Conta {
    // atributos
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public Conta(int agencia, int numero) {
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Criando nova conta: " + "agência: " + this.agencia + " conta: " + this.numero);        
    }
    
    // métodos
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }
    
    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            //destino.saldo += valor; opção 1
            destino.deposita(valor); // opção 2
            return true;
        } 
        return false;
    }
    
    // Getter and Setters
    public double getSaldo() {
        return this.saldo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        if(numero <= 0) {
            System.out.println("Não é permitido número menor ou igual a zero.");
            return;
        }
        this.numero = numero; 
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Não é permitido número menor ou igual a zero.");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }
    
     public void setTitular(Cliente titular) {
        this.titular = titular;
    }
     
     // método get da classe
    public static int getTotal() {
        return total;
    }
}
