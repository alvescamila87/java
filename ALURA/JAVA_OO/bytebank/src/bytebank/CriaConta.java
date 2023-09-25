package bytebank;

/**
 *
 * @author Camila
 */
public class CriaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println("Primeira conta te R$: " + primeiraConta.saldo);
        
        primeiraConta.saldo += 100;;
        System.out.println(primeiraConta.saldo);
        
        Conta segundaConta = new Conta();
        segundaConta.saldo = 1500;
        System.out.println("Segunda conta te R$: " + segundaConta.saldo);
        
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
