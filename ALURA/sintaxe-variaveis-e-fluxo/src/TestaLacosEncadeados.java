/**
 *
 * @author Camila
 */
public class TestaLacosEncadeados {
    public static void main(String[] args) {
        // tabuada 1 a 10
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for (int contador = 1; contador <= 10; contador ++) {
                System.out.print(multiplicador * contador);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
