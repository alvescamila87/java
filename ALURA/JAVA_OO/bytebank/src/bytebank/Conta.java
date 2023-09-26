
package bytebank;

/**
 *
 * @author Camila
 */
public class Conta {
    // atributos
    double saldo;
    int agencia;
    int numero;
    //String titular;    
    Cliente titular; //nome da classe Cliente como tipo de titular
    
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
}
