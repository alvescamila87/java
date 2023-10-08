public class RepeticaoEx16_imprimirTrianguloCrescente {
    public static void main(String[] args) {

        for (int linha = 0; linha <= 5; linha++) {

            for (int coluna = 0; coluna < linha; coluna++) {
                System.out.print("*");

            }
            System.out.print("\n");

        }
    }
}
