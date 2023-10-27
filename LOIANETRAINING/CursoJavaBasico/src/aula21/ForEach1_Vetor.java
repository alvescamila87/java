package aula21;

import java.util.Random;

public class ForEach1_Vetor {
    public static void main(String[] args) {
        
        int[] vetorNumeros = new int[10];

        Random random = new Random();

        for (int i = 0; i < vetorNumeros.length; i++) {
            vetorNumeros[i] = random.nextInt(10);
        }

        System.out.println("Usando o FOR DEFAULT");
        for (int i = 0; i < vetorNumeros.length; i++) {
            int numero = vetorNumeros[i];
            System.out.println(numero);
        }
        System.out.println("Usando o FOR EACH");
        for (int numero: vetorNumeros) {
            System.out.println(numero);
        }
    }
}
