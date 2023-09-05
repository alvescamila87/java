
package prepprova01;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe a quantidade de pessoas (público) do jogo de futebol: ");
        int publico = entrada.nextInt();
        
        // Processamento de dados
        float qtd_popular = publico * 0.10f;
        float ing_popular = 5.00f * qtd_popular;
        
        float qtd_geral = publico * 0.50f;
        float ing_geral = 10.00f * qtd_geral;        
        
        float qtd_arquibancada =  publico * 0.30f;
        float ing_arquibancada = 20.00f * qtd_arquibancada;
        
        float qtd_cadeiras = publico * 0.10f;
        float ing_cadeiras = 30.00f * qtd_cadeiras;

        float valor_total = (ing_cadeiras + ing_arquibancada + ing_cadeiras + ing_popular);
 
        // Saída de dados:
        System.out.println("Informações da partida de futebol: ");
        System.out.printf(" - Público total da partida: %s pessoas.\n", publico);
        System.out.printf(" - Valor total da partida: R$%.2f.\n", valor_total);
        System.out.printf(" - Ingresso popular: %.0f de pessoas R$%.2f.\n", qtd_popular, ing_popular);
        System.out.printf(" - Ingresso geral: %.0f de pessoas R$%.2f.\n", qtd_geral, ing_geral);
        System.out.printf(" - Ingresso arquibancada: %.0f de pessoas R$%.2f.\n", qtd_arquibancada, ing_arquibancada);
        System.out.printf(" - Ingresso cadeiras: %.0f de pessoas R$%.2f.\n", qtd_cadeiras, ing_cadeiras);
        
        entrada.close();      
        
    }
    
}
