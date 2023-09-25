
package bytebank;

/**
 *
 * @author Camila
 */
public class TestaReferencia {
    public static void main(String[] args) {
        // Uma única conta
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Primeira conta: " + primeiraConta.saldo);
        
        // não é uma conta, é uma referência para a primeira conta
        Conta segundaConta = primeiraConta;
        System.out.println("Segunda conta: " + segundaConta.saldo);
        
        segundaConta.saldo += 100;
        System.out.println("Segunda conta: " + segundaConta.saldo);
        System.out.println("Primeira conta: " + primeiraConta.saldo);
        
        // == compara referência não o objeto
        if(primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }
        
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
    
}
