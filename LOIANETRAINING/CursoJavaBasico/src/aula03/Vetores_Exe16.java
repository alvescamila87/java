package aula03;

import java.util.Scanner;

public class Vetores_Exe16 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int contador15 = 0;
        int contador15Acima = 0;
        int soma15 = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %sº valor inteiro: ", i);
            vetorA[i] = entrada.nextInt();

            if (vetorA[i] < 15) {
                soma = soma + vetorA[i];
            } else if (vetorA[i] == 15) {
                contador15++;
            } else {
                soma15 = soma15 + vetorA[i];
                contador15Acima++;
            }

        }
        System.out.println("A soma dos elementos inferiores a 15 é de: " + soma);
        System.out.println("A quantidade dos elementos iguais a 15 é de: " + contador15);
        System.out.println("A média dos elementos superiores a 15 é de: " + soma15 / contador15Acima);


    }
}
