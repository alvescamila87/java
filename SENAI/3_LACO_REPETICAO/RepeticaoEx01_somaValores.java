import java.util.Scanner;

public class RepeticaoEx01_somaValores {
    public static void main(String[] args) {

        /*
         * 1. Escreva um algoritmo que leia dez valores numéricos inteiros e apresente
         * na tela o somatório dos valores.
         */

        Scanner entrada = new Scanner (System.in);


        int contador = 0;
        int soma =0;

        while (contador < 10) {

            System.out.printf("Informe o %sº valor inteiro: ", contador + 1);
            int valor = entrada.nextInt();
            contador++;
            soma = soma + valor;
        }
        System.out.printf("A soma dos %s valores informados é: %s", contador, soma);

    }
}
