/**
 *
 * @author Camila
 */
public class TesteSomatoria {
    public static void main(String[] args) {
        // somatoria de números de 0 a 10
        int contador = 0;
        int soma = 0;
        
        while (contador <= 10) {
            soma = soma + contador;
            contador ++;
        }
        System.out.println(soma);
    }
    
}
