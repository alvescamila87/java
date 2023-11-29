
package aula10_matrizes;

/**
 *
 * @author camila_alves3
 */
public class Matriz2x2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // matriz 2x2
        
        int[][] matrizNumerosInteiros = {{1,2}, {3, 4}};
        int soma = 0;
        
        for (int linha = 0; linha < matrizNumerosInteiros.length; linha++) {
            for (int coluna = 0; coluna < matrizNumerosInteiros.length; coluna++) {
                
                System.out.printf("Na posição (%s, %s): %s \n", linha, coluna, matrizNumerosInteiros[linha][coluna]);
                
                soma += matrizNumerosInteiros[linha][coluna];
            }
            
        }
        System.out.println("");
        System.out.println("A soma dos elementos da matriz é: " + soma);
    }
    
}
