
package aula06_lacosderepeticao;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex04_validadorSenha {
    
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner (System.in);
            
            int contador = 0;
            
            System.out.println("Informe uma senha: ");
            String senha = entrada.next();
                        
            String confirmacaoSenha = "";
            
            
            
            while (!senha.equals(confirmacaoSenha)) {
                
                System.out.println("Confirme a senha: ");
                confirmacaoSenha = entrada.next();
                contador++;

            }
            System.out.println("Senha correta! Tentativas de confirmação: " + contador);
            
            

    }

    
}
