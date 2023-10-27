package aula21;

import java.util.Random;
import java.util.Scanner;

public class ForEach_Exe03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] vetorNumeros = new int[10];

        Random random = new Random();

        for (int i = 0; i < vetorNumeros.length; i++) {

            vetorNumeros[i] = random.nextInt(100);

        }

        for (int numero :
                vetorNumeros) {
            System.out.println(numero);
        }
    }
}
