
package aula10_matrizes;

/**
 *
 * @author camila_alves3
 */
public class Matriz4x4 {
    
    public static void main(String[] args) {
        
        int[][] matrizNumeros = {{1, 2, 3, 4}, {2, 1, 4, 3}, {3, 4, 1, 2}, {4, 3, 2, 1}};
        
        boolean simetrica = true;
        
        for (int i = 0; i < matrizNumeros.length; i++) {
            
            for (int j = 0; j < matrizNumeros.length; j++) {
                
                if(matrizNumeros[i][j] != matrizNumeros[j][i]) {
                    simetrica = false;
                    break;
                }
                
            }
            
        }
        
        if(simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
        }
        
    }
    
}
