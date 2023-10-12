package geral;

import java.util.*;

public class Exe04_parImpar {
    public static void main(String[] args) {

        /*
         * Laço de repetição Do While / While e  if
         * Faça um programa que solicite ao usuário um valor inteiro, em seguida informe se o número digitado
         * é impar ou par. O programa deve parar de ler números quando o usuário digitar o número 0.
         * Ao sair o algoritmo deve imprimir em tela uma lista dos números impares e suas posições no vetor
         * e uma outra lista com números pares e sua posição no vetor.
         */

        Scanner entrada = new Scanner (System.in);
        int contador = 0;
        int numero = 0;
        ArrayList<Integer> vetorPares = new ArrayList<>();
        ArrayList<Integer> vetorImpares = new ArrayList<>();

        while (true) {

            System.out.printf("Informe o %sº número inteiro: ", contador+1);
            numero = entrada.nextInt();

            if (numero == 0) {
                System.out.printf("Programa finalizado! \n");
                break;
            }

            if (numero % 2 == 0) {
                vetorPares.add(numero);
            } else {
                vetorImpares.add(numero);
            }
            contador++;
        }
        Collections.sort(vetorPares);
        Collections.sort(vetorImpares);
        System.out.printf("Números pares informados: %s \n", vetorPares);
        System.out.printf("Números pares informados: %s \n", vetorImpares);
    }
}
