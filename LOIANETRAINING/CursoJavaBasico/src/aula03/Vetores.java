package aula03;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

      double[] vetorTemperaturas = new double[365];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < vetorTemperaturas.length; i++) {
            System.out.println("Informe a temperatura: ");
            vetorTemperaturas[i] = entrada.nextDouble();

            System.out.println("Temperatura: " + vetorTemperaturas[i]);
        }

        // for melhorado

        for (double temperatura : vetorTemperaturas) {
            System.out.println(temperatura);
        }

    }
}
