
package exe28_vogalsubsequente;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe28_VogalSubsequente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe uma vogal maiúscula: ");
        char vogal = entrada.next().charAt(0);
        char subsequente = 'B';
        if (vogal == 'A') {
            subsequente = 'E';
        }
        else if (vogal == 'E') {
            subsequente = 'I';
        } 
        else if (vogal == 'I') {
            subsequente = 'O';
        }
        else if (vogal == 'O') {
            subsequente = 'U';
        } 
        else if (vogal == 'U') {
            subsequente = 'A';
        }
        switch(vogal) {
            case 'A': System.out.printf("A vogal subsequente de %s é %s.\n", vogal, subsequente);
            break;
            case 'E': System.out.printf("A vogal subsequente de %s é %s.\n", vogal, subsequente);
            break;
            case 'I': System.out.printf("A vogal subsequente de %s é %s.\n", vogal, subsequente);
            break;
            case 'O': System.out.printf("A vogal subsequente de %s é %s.\n", vogal, subsequente);
            break;
            case 'U': System.out.printf("A vogal subsequente de %s é %s.\n", vogal, subsequente);
            break;
            default: System.out.println("ERRO: Opção inválida. Tente novamente!");
        }
            
        entrada.close();
    }
    
}