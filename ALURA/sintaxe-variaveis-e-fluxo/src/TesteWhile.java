/**
 *
 * @author Camila
 */
public class TesteWhile {
    
    public static void main(String[] args) {
        // contar de 0 a 10 imprimindo todos os números
        int contador = 0;
        
        while (contador <= 10) {
            System.out.println("Número: " + contador);
//            contador = contador + 1;
//            contador += 1;
              contador ++;
//            ++contador;
        }
        // fora do escopo, mas mostra a continuação após o 10.
        System.out.println(contador);
    }
    
}
