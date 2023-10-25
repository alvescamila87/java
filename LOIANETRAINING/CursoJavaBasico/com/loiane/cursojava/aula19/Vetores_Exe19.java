package com.loiane.cursojava.aula19;

import java.util.Scanner;

public class Vetores_Exe19 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double[] nota1 = new double[5];
        double[] nota2 = new double[nota1.length];
        double[] resultado = new double[nota2.length];

        for (int i = 0; i < nota1.length; i++) {
            System.out.printf("Informe a %sª nota da prova 1: \n", i);
            nota1[i] = entrada.nextDouble();

            System.out.printf("Informe a %sª nota da prova 2: \n", i);
            nota1[i] = entrada.nextDouble();

            resultado[i] = (nota1[i] + nota2[i]) / 2;

        }

        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);

        }




    }
}
