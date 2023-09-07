
package exe20_maioridade;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe20_Maioridade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a idade: ");
        int idade = entrada.nextInt();
        
        // Processamento e saída de dados
        if (idade < 18) {
            System.out.printf("Idade: %s anos. Classificação: MENOR DE IDADE.\n", idade);
        } 
        else if (idade >= 18 && idade <= 64) {
            System.out.printf("Idade: %s anos. Classificação: MAIOR DE IDADE.\n", idade);
        } 
        else {
            System.out.printf("Idade: %s anos. Classificação: IDOSO.\n", idade);
            
        }
        
        entrada.close();
    }
    
}
