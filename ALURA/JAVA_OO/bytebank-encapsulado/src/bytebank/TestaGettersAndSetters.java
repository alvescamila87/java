
package bytebank;

/**
 *
 * @author Camila
 */
public class TestaGettersAndSetters {
    public static void main(String[] args) {
        
        Conta conta = new Conta(3307, 96325);
//        conta.setNumero(3307);
        System.out.println("Número conta: " + conta.getNumero());
        
        Cliente camila = new Cliente();
        camila.setNome("Camila Maria");
        camila.setCpf("222.222.333-55");
        camila.setProfissao("Analista de Desenvolvimento");
        
        // vincular as classes: Conta e Cliente
        conta.setTitular(camila);
        
        System.out.println(conta.getTitular());
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());
        
        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());
        // agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programadora");
        
        //mesmos registros
        System.out.println(titularDaConta);
        System.out.println(camila);
        System.out.println(conta.getTitular());
       
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getProfissao());
        
        
        
        
        
    }
    
}
