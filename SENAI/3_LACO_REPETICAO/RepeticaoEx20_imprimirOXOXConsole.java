import java.util.Scanner;

public class RepeticaoEx20_imprimirOXOXConsole {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o tamanho do tabuleiro: ");
        int tamanho = entrada.nextInt();

        for (int linha = 0; linha < tamanho; linha++) {

            for (int coluna = 0; coluna < tamanho; coluna++) {

                if(linha % 2 == 0) {
                    if (coluna % 2 == 0) {
                        System.out.print(" X ");
                    }
                    else {
                        System.out.print("O");
                    }
                } else {
                    if(coluna % 2 == 0) {
                        System.out.print(" O ");
                    }
                    else {
                        System.out.print("x");
                    }
                }

            }
            System.out.print("\n");

        }
        entrada.close();
    }
}