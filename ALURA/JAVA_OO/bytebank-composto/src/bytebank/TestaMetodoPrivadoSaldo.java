package bytebank;




/**
 *
 * @author Camila
 */
public class TestaMetodoPrivadoSaldo {
    public static void main(String[] args) {
        
        Conta conta1 = new Conta();
        conta1.deposita(100);
        conta1.saca(50);
        
        System.out.println("Saldo atualizado de: " + conta1.getSaldo());
        
    }
    
}
