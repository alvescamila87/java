
package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe10 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a cidadania da pessoa: ");
        System.out.printf("[1] Brasileiro \n");
        System.out.printf("[2] Alemão \n");
        System.out.printf("[3] Inglês \n");
        System.out.printf("[4] Italiano \n");
        System.out.printf("[5] Espanhhol \n");
        System.out.printf("[6] Francês \n");
        int opcao = entrada.nextInt();
        
        // Processamento e saída de dados
        switch(opcao) {
            case 1: System.out.println("O brasileiro tem o PORTUGUÊS como língua nativa.");
            break;
            case 2: System.out.println("O alemão tem o ALEMÃO como língua nativa.");
            break;
            case 3: System.out.println("O inglês tem o INGLÊS como língua nativa.");
            break;
            case 4: System.out.println("O italiano tem o ITALIANO como língua nativa.");
            break;
            case 5: System.out.println("O espanhol tem o ESPANHOL como língua nativa.");
            break;
            case 6: System.out.println("O francês tem o FRANCÊS como língua nativa.");
            break;
            default: System.out.println("Opção inválida! A cidadania não pode ser verificada.");
        }
        entrada.close();
    }
}
