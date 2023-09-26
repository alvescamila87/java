
package bytebank;

/**
 *
 * @author Camila
 */
public class TestaGettersAndSetters {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.setNumero(3307);
        System.out.println("Número conta: " + conta.getNumero());
        
        Cliente camila = new Cliente();
        camila.setNome("Camila Maria");
        camila.setCpf("222.222.333-55");
        camila.setProfissao("Analista de Desenvolvimento");
        
        // vincular as classes: Conta e Cliente
        conta.setTitular(camila);
        
        System.out.println(conta.getTitular());
        
        
        
        
        
    }
    
}
