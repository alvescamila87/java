package repeticao;

public class RepeticaoEx17_imprimirTrianguloDecrescente {
    public static void main(String[] args) {

        for (int linha = 0; linha <= 5; linha++) {

            for (int coluna = 5; coluna > linha; coluna--) {

                System.out.print("*");

            }
            System.out.print("\n");
        }
    }
}
