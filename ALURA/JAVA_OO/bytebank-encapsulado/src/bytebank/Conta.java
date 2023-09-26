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
        this.numero = numero; 
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    
    
    
}
