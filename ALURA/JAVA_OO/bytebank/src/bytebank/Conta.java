
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
    String titular;    
    
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
}
