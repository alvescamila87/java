
package aula03_lacosrepeticaowhile;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class While_Exe08_senha {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite uma senha: ");
        String senha = entrada.next();
        
        String confirmacaoSenha = "";
            
 
        while (true) {
            System.out.println("Informe a senha novamente: ");
            confirmacaoSenha = entrada.next();
            
            if (senha.equals(confirmacaoSenha)) {
                System.out.println("Senha válida!");
                break;
            } 
            
            if (senha != confirmacaoSenha ){
                System.out.println("A senha digitada anteriormente NÃO confere!");
            }
            
        }
    }
    
}
