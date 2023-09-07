/**
 *
 * @author Camila
 */
public class TestaLacosFor_Escada {
    public static void main(String[] args) {
        // escadinha (matriz triangular)
        for (int linha = 0; linha < 10; linha++) {
            for (int coluna = 0; coluna < 10; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print("*");
            }
        System.out.println();
       }
       
    }    
}
