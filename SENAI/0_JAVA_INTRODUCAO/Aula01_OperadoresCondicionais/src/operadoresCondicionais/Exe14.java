
package operadoresCondicionais;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe14 {
    public static void main(String[] args) {
        
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o tempo de viagem: (min) ");
        int tempoViagem = entrada.nextInt();
        
        System.out.println("Informe a velocidade média na viagem: (km/h) ");
        int mediaVelocidade = entrada.nextInt();
        
        // Processamento de dados
        // Distância percorrida
        int distancia = tempoViagem * mediaVelocidade;
        
        // Consumo gasolina
        int kmLitro = 12;
        float consumo = distancia / kmLitro;
        
        // Saída de dados
        System.out.printf("Velocidade média: %s km/h. \n", mediaVelocidade);
        System.out.printf("Tempo de viagem: %s min. \n", tempoViagem);
        System.out.printf("Distância percorrida: %s km. \n", distancia);
        System.out.printf("Consumo por litro/km: %s km. \n", kmLitro);
        System.out.printf("Consumo total da viagem: %s lts gasolina. \n", consumo);
    }
    
}
