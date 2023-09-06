
package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe06 {
    public static void main(String[] args) {
        // Entrada de dados
//        Scanner entrada = new Scanner(System.in);

        int joao = 25;
        int chico = 5;
        int pedro = 4;
        int bola = 2;
        int qtdPontosTime = (chico + pedro + bola);
        
        if (joao < qtdPontosTime / 2) {
            System.out.println("ITME DESCLASSIFICADO!");
            System.out.println("O jogador João não pode ter um número de pontos menor que a metade da soma dos pontos dos demais jogadores que compõem a equipe");
            System.out.printf("Pontos João: %s.\n", joao);
            System.out.printf("Soma de pontos de Pedro, Chico, João dividido pela metade: %s. \n", qtdPontosTime / 2);
        }
        else if (pedro > bola * 3) {
            System.out.println("TIME DESCLASSIFICADO!");
            System.out.println("O jogador Pedro não pode ficar com o triplo de pontos do jogador Bola.");
            System.out.printf("Pontos Pedro: %s.\n", joao);
            System.out.printf("Triplo de pontos do Bola corresponde a: %s pontos. \n", bola * 3);
        }
        else if (chico == 0) {
            System.out.println("TIME DESCLASSIFICADO!");
            System.out.println("O jogador Chico não pode ficar com zero pontos.");
            System.out.printf("Pontos Chico: %s.\n", chico);   
        } 
        else if (bola > pedro / 2 || bola > joao + chico) {
            System.out.println("TIME DESCLASSIFICADO!");
            System.out.println("O jogador Bola pode ficar com até metade dos pontos do jogador Pedro OU");
            System.out.println("abaixo da soma de pontos dos jogadores João e Chico.");
            System.out.printf("Pontos Bola: %s. \n", bola);
            System.out.printf("Metade de pontos de Pedro corresponde a: %s pontos. \n", pedro / 2);
            System.out.printf("Soma de pontos de João e Chico corresponde a: %s pontos. \n", joao + chico);
        }
        else {
            System.out.println("TIME CLASSIFICADO!!!");
        }
              
    }
    
}
