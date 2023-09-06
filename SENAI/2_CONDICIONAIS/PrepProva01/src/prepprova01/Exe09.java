package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe09 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a distância percorrida pelo nadador em metros: ");
        float distancia = entrada.nextFloat();
        
        // Processamento e saída de dados
        if (distancia < 800) {
            System.out.printf("Distância percorrida pelo nadador %.1f metros.\n", distancia);
            System.out.println("Prêmio a receber R$5.000,00.");
        } else if (distancia >= 800 && distancia <= 1500) {
            System.out.printf("Distância percorrida pelo nadador %.1f metros.\n", distancia);
            System.out.println("Prêmio a receber R$10.000,00.");
        } else {
            System.out.printf("Distância percorrida pelo nadador %.1f metros.\n", distancia);
            System.out.println("Prêmio a receber R$15.000,00.");
        }
        
        entrada.close();
    }
    
}
