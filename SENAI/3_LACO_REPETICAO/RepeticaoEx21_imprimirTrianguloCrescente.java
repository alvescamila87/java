import java.util.Scanner;

public class RepeticaoEx21_imprimirTrianguloCrescente {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro para o tamanho do triângulo: ");
        int tamanho = entrada.nextInt();

        for (int linha = 0; linha < tamanho; linha++) {

            for (int coluna = 0; coluna < linha; coluna++) {

                System.out.print("*");

            }
            System.out.print("\n");

        }
    }
}
