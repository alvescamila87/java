package aula34;

import java.util.Scanner;

public class Ex03_Fatorial {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;

        do {

            System.out.println("Informe um número inteiro positivo: ");
            num = entrada.nextInt();

            if(num < 0) {

                System.out.println("Número negativo. Tente novamente!");

            }


        } while (num < 0);

        System.out.println(Calculadora.fatorial(num));
    }
}
