import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RepeticaoEx12_produtoParesSomatorioImpares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int produto = 1;
        int soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("Informe o %sº número inteiro: ", i);
            int numero = entrada.nextInt();

            if (numero < 0) {
                System.out.println("ERRO: Número negativo não é permitido.");
            } else if (numero == 0) {
                System.out.println("Fim do programa!");
                break;
            }

            if (numero % 2 == 0) {
                produto = produto * numero;
            } else {
                soma = soma + numero;
            }

        }
        System.out.printf("O produto dos números pares informados é: %s. \n", produto);
        System.out.printf("A soma dos números ímpares informados é: %s.\n", soma);
        entrada.close();
    }
}

