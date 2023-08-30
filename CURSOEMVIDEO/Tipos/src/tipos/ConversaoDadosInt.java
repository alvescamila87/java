
package tipos;

public class ConversaoDadosInt {
    public static void main(String[] args) {
        
        // Conversão de string para inteiro:
        String valor = "30";
        
        // 1) Não funciona
        //int idade = valor;
        
        // 2) Não funciona no typecast
        //int idade = (int) valor; 
        
        // 3) Funciona com wrapper class
        int idade = Integer.parseInt(valor);
        System.out.printf("Idade string para inteiro: %s.\n", idade);
    }
    
}
