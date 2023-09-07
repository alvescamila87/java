
package exe31_conversaomedidas;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe31_ConversaoMedidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o comprimento em metros: (m) ");
        float medida = entrada.nextFloat();
        System.out.println("Selecine uma opção do menu: ");
        System.out.println("Opção [1]: Converter (m) para Centímetros (cm)");
        System.out.println("Opção [2]: Converter (m) para Decímetros (dm)");
        System.out.println("Opção [3]: Converter (m) para Quilômetros (km)");
        System.out.println("Opção [4]: Converter (m) para Polegadas (pol) ");
        int opcao = entrada.nextInt();
      
        
        switch(opcao) {
            case 1: 
                float conversao = (medida * 100);
                System.out.printf("%.2f (m) convertidos para centímetros correspondem à: %.2f cm.\n", medida, conversao);
            break;
            case 2: 
                conversao = (medida * 10);
                System.out.printf("%.2f (m) convertidos para decímetros correspondem à: %.2f dm.\n", medida, conversao);
            break;
            case 3: 
                conversao = (medida / 1000);
                System.out.printf("%.2f (m) convertidos para quilômetros correspondem à: %.2f km.\n", medida, conversao);
            break;
            case 4:
                conversao = 39.37f * medida;
                System.out.printf("%.2f (m) convertidos para polegadas correspondem à: %.2f polegadas.\n", medida, conversao);
               break;
            default: System.out.println("ERRO: Opção inválida. Tente novamente!");
        }
            
        entrada.close();
    }
    
}