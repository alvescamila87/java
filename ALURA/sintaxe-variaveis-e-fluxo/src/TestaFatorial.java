
/**
 *
 * @author Camila
 */
public class TestaFatorial {
    public static void main(String[] args) {
        int fatorial = 1;
        for (int contador = 1; contador <= 10; contador++) {
            fatorial = fatorial * contador;
            System.out.printf("Fatorial de (%s!) = %s \n", contador, fatorial);
        }
    }
}
