
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
        float qtdPopular = publico * 0.10f;
        float ingPopular = 5.00f * qtdPopular;
        
        float qtdGeral = publico * 0.50f;
        float ingGeral = 10.00f * qtdGeral;        
        
        float qtdArquibancada =  publico * 0.30f;
        float ingArquibancada = 20.00f * qtdArquibancada;
        
        float qtdCadeiras = publico * 0.10f;
        float ingCadeiras = 30.00f * qtdCadeiras;

        float valor_total = (ingCadeiras + ingArquibancada + ingGeral + ingPopular);
 
        // Saída de dados:
        System.out.println("Informações da partida de futebol: ");
        System.out.printf(" - Público total da partida: %s pessoas.\n", publico);
        System.out.printf(" - Valor total da partida: R$%.2f.\n", valor_total);
        System.out.printf(" - Ingresso popular: %.0f de pessoas R$%.2f.\n", qtdPopular, ingPopular);
        System.out.printf(" - Ingresso geral: %.0f de pessoas R$%.2f.\n", qtdGeral, ingGeral);
        System.out.printf(" - Ingresso arquibancada: %.0f de pessoas R$%.2f.\n", qtdArquibancada, ingArquibancada);
        System.out.printf(" - Ingresso cadeiras: %.0f de pessoas R$%.2f.\n", qtdCadeiras, ingCadeiras);
        
        entrada.close();      
        
    }
    
}
