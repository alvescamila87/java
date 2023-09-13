
package comprasapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camila
 */
public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;
    
    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompra(Compra compra) {
        if (this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        } 
        return false;
    }
        
        
    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }
      
}
