/**
 *
 * @author Camila
 */
public class TestaLacoFor_Numeros {
    
    public static void main(String[] args) {
        
        for (int linha = 0; linha <= 50; linha ++) {
            for (int coluna = 0; coluna <= 50; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print(coluna);
            }
            System.out.println();
        }
        
        
    }
    
}
