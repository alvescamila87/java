
package bytebank;

/**
 *
 * @author Camila
 */
public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDaCamila = new Conta();
        contaDaCamila.saldo = 100;
        contaDaCamila.deposita(50);
        System.out.println(contaDaCamila.saldo);
        
        boolean conseguiuRetirar = contaDaCamila.saca(30);
        System.out.println(contaDaCamila.saldo);
        System.out.println(conseguiuRetirar);
    }
    
}
