package aula21;

import java.util.Random;

public class ForEach_Exe01 {

    public static void main(String[] args) {

        double[] vetorNotas = new double[10];

        Random random = new Random();

        for (int i = 0; i < vetorNotas.length; i++) {

            vetorNotas[i] = random.nextDouble(10);

        }

        for (double nota : vetorNotas ) {
            System.out.println(nota);
        }
    }
}
