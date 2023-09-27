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
        Conta conta = new Conta(2309,99963);
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        
        Conta conta2 = new Conta(9632, 96874);
        Conta conta3 = new Conta(8741, 96456);
        
        System.out.println(Conta.getTotal());
        // não deve passar como conta2, pois é um método static da classe
        System.out.println(conta2.getTotal());
    }
    
}
