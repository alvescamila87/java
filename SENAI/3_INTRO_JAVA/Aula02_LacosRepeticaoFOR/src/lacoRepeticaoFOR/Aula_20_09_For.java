package lacoRepeticaoFOR;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Aula_20_09_For {
    public static void main(String[] args) {
        
        String opcao = "";
        
        do {
            
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe um número de 1 a 10: ");
        int numero = entrada.nextInt();
                
        for (int i = 1; i <= 10; i++) {
            if (i == 0 || numero == 0) {
                System.out.println("ERRO: Número multiplicado por zero é zero!");
                break;
            } else {
                System.out.printf("%s X %s = %s \n", numero, i, numero * i);
            }
        }
        System.out.println("Deseja continuar [S/N]: ");
        opcao = entrada.next().toUpperCase();
            
        } while(opcao.equals("S"));
        
    }

}
