package geral;

import java.util.Scanner;

public class Exe01_somaSubstracaoDivisaoMultiplicacao {
    public static void main(String[] args) {

        /*
         * Desenvolva um algoritmo que receba dois valores numéricos (v1 e v2) e apresente em tela
         * o resultado de cinco operações matemáticas básicas entre eles: soma, subtração, divisão,
         * multiplicação e resto da divisão.
         */

        // Entrada de dados
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o 1º valor inteiro: ");
        int valor1 = entrada.nextInt();

        System.out.println("Informe o 2º valor inteiro: ");
        int valor2 = entrada.nextInt();

        // Processamento de dados

        // soma

        if (valor1 < 0 && valor2 < 0) {
            System.out.println("[ERRO]: Não é permitido valor negativo.");
        } else {
            int soma = 0;
            soma = valor1 + valor2;
            System.out.printf("A soma dos números %s e %s é: %s \n", valor1, valor2, soma);
        }

        // subtração
        if (valor1 < 0 && valor2 < 0) {
            System.out.println("[ERRO]: Não é permitido valor negativo.");
        } else {
            int subtracao = 0;
            subtracao = valor1 - valor2;
            System.out.printf("A subtração entre números %s e %s é: %s \n", valor1, valor2, subtracao);
        }

        // divisão
        if (valor1 <= 0 && valor2 <= 0) {
            System.out.println("[ERRO]: Não é permitido valor negativo OU não é possível fazer divisão por ZERO.");
        } else {
            int divisao = 0;
            divisao = valor1 / valor2;
            System.out.printf("A divisão inteira entre números %s e %s é: %s \n", valor1, valor2, divisao);
        }

        // multiplicação
        if (valor1 <= 0 && valor2 <= 0) {
            System.out.println("[ERRO]: Não é permitido valor negativo OU qualquer mutiplicação por zero é zero.");
        } else {
            int multiplicacao = 0;
            multiplicacao = valor1 * valor2;
            System.out.printf("A mutiplicação entre números %s e %s é: %s \n", valor1, valor2, multiplicacao);
        }

        // resto da divisão
        if (valor1 <= 0 && valor2 <= 0) {
            System.out.println("[ERRO]: Não é permitido valor negativo OU não é possível fazer divisão por ZERO.");
        } else {
            int resto = 0;
            resto = valor1 % valor2;
            System.out.printf("O resto da divsão entre números %s e %s é: %s \n", valor1, valor2, resto);
        }
        entrada.close();
    }
}
