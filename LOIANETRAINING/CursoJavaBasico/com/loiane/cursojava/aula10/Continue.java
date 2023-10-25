package com.loiane.cursojava.aula10;

import java.util.Scanner;

public class Continue {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um limite mínimo: ");
        int min = entrada.nextInt();

        System.out.println("Informe um limite mínimo: ");
        int max = entrada.nextInt();

        for (int i = min; i < max; i++) {

            if(i % 7 == 0) {
                continue;
            }
            System.out.println("I: " + i);
        }

    }
}
