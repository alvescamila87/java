package bytebank;

/**
 *
 * @author Camila
 */
public class TestaValores {
    public static void main(String[] args) {
        
        //Com construtor padrão java
//        Conta conta = new Conta();
//        conta.setAgencia(-50);
//        conta.setNumero(-330);
        
        //Com construtor com parâmetros padrões criados
        Conta conta = new Conta(2307,99963);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
    }
    
}
