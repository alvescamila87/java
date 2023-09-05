
package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe02 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantidade de combustível abastecido em litros: ");
        int qtGasolina = teclado.nextInt();
        System.out.println("Informe o consumo do veículo por litro: ");
        float kmLitro = teclado.nextFloat();
        
        // Processamento de dados
        float distancia = qtGasolina * kmLitro;
        
        // Saída de dados
        System.out.printf("Com %s lts de gasolina, o veículo pode percorrer a distância máxima de: %.1f km.", qtGasolina, distancia);
        
        teclado.close();
    }
    
}
