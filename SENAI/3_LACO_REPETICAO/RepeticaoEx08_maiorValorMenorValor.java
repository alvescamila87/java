import java.util.Scanner;

public class RepeticaoEx08_maiorValorMenorValor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valor = 0;
        int soma = 0;
        Integer maiorValor = Integer.MIN_VALUE;
        Integer menorValor = Integer.MAX_VALUE;

        for (int i = 1; i <= 50; i++) {

            System.out.printf("Informe o %sº valor inteiro: \n", i);
            valor = entrada.nextInt();
            soma = soma + valor;

            if (valor > maiorValor) {
                maiorValor = valor;
            } else if (valor < menorValor) {
                menorValor = valor;
            }


        }
        System.out.printf("Maior valor informado: %s \n", maiorValor);
        System.out.printf("Menor valor informado: %s \n", menorValor);



    }
}
