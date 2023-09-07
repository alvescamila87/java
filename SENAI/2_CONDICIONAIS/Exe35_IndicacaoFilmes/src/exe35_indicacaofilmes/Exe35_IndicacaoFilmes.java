
package exe35_indicacaofilmes;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe35_IndicacaoFilmes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Selecione uma opção do MENU de categorias de filme: ");
        System.out.println("[1] - Categoria TERROR");
        System.out.println("[2] - Categoria DRAMA");
        System.out.println("[3] - Categoria COMÉDIA");
        System.out.println("[4] - Categoria FICÇÃO");
        int opcao = entrada.nextInt();
        
        switch(opcao) {
            case 1: System.out.println("Para a categoria TERROR, segue indicação de filme: 'Atividade paranormal, (2007)'.");
            break;
            case 2: System.out.println("Para a categoria DRAMA, segue indicação de filme: 'Um sonho de liberdade, (1994)'.");
            break;
            case 3: System.out.println("Para a categoria COMÉDIA, segue indicação de filme: 'Esqueceram de mim, (1990)'.");
            break;
            case 4: System.out.println("Para a categoria FICÇÃO, segue indicação de filme: 'O Senhor dos Anéis: O retorno do Rei, (2003)'.");
            break;
            default: System.out.println("ERRO: opção inválida. Tente novamente.\n");
        }
        entrada.close();
    }
                       
}
