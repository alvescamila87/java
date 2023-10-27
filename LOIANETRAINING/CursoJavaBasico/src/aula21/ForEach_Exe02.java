package aula21;

import java.util.Scanner;

public class ForEach_Exe02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] vetorNomes = new String[10];

        for (int i = 0; i < vetorNomes.length; i++) {

            System.out.printf("Informe o %sº nome: ", i+1);
            vetorNomes[i] = entrada.next();

        }

        for (String nome: vetorNomes) {
            System.out.println(nome);
        }

    }
}
