
package tipos;


public class ConversaoDadosString {
    public static void main(String[] args) {
        // Conversão de inteiro para string:
        int idade = 30;
        
        // 1) Não funciona conversão de inteiro para string
        // String valor = idade;
        
        // 2) Não funciona Typecast
        // String valor = (String) idade;
        
        // 3) Funciona wrapper class
        String valor = Integer.toString(idade);
        System.out.printf("Idade inteiro para string: %s.\n", valor);
    }
    
}
