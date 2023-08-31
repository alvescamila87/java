
package aula23_08;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe09 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a quantidade de pontos do líder do campeonato: ");
        int qtdPontosLider = entrada.nextInt();
        
        System.out.println("Informe a quantidade de pontos do time lanterna: ");
        int qtdPontosLanterna = entrada.nextInt();
        
        // Processamento de dados
        int vitoriasNecessarias = (qtdPontosLider - qtdPontosLanterna) / 3;
        
            if (vitoriasNecessarias == 0) {
                // Saída de dados
                System.out.printf("O time lanterna precisa vencer apenas %s partida para ultrapassar o time líder na pontuação.\n", vitoriasNecessarias + 1);
            }
            if (vitoriasNecessarias < 0) {
                // Saída de dados
                System.out.printf("O time lanterna está à frente do time líder por %s jogos em pontuação.\n", vitoriasNecessarias * (-1));
            }
            if (vitoriasNecessarias > 0) {
                // Saída de dados
                System.out.printf("O time lanterna precisa vencer o time líder por %s jogos para alcançá-lo na pontuação.\n", vitoriasNecessarias);
            }
      
        entrada.close();
    }
}
