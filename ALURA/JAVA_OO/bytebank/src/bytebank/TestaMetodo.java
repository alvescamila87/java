
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
        
        // 1 - Associando pass-a-passo:
        
        //contaDaCamila.titular = "Camila Maria";
        //System.out.println(contaDaCamila.titular);
        
        Cliente camila = new Cliente();
        camila.nome = "Camila Maria";
        camila.cpf = "222.222.222-22";
        camila.profissao = "Desenvolvedora";
        
        contaDaCamila.titular = camila;
        System.out.println(contaDaCamila.titular); // referencia o mesmo objeto
        System.out.println(camila); // referencia o mesmo objeto
        System.out.println(contaDaCamila.titular.nome);
        
        // 2 - Associando diretamente:
        Conta contaDaIsabel = new Conta();
        System.out.println(contaDaIsabel.saldo);
        
        contaDaIsabel.titular = new Cliente();
        System.out.println(contaDaIsabel.titular);
        
        contaDaIsabel.titular.nome = "Isabel";
        System.out.println(contaDaIsabel.titular.nome);
    }
    
}
