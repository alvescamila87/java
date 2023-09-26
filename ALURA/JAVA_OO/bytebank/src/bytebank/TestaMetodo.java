
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
        
        boolean conseguiuRetirar = contaDaCamila.saca(20);
        System.out.println(contaDaCamila.saldo);
        System.out.println(conseguiuRetirar);
        
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        
        boolean sucessoTransferencia = 
                contaDaMarcela.transfere(300, contaDaCamila);
        if (sucessoTransferencia) {
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!"); 
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDaCamila.saldo);
    }
    
}
