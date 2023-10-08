package repeticao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RepeticaoEx11_intervaloParesImpares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número inteiro como limite INFERIOR de intervalo: ");
        int limiteInferior = entrada.nextInt();

        System.out.println("Informe um número inteiro como limite SUPERIOR de intervalo: ");
        int limiteSuperior = entrada.nextInt();

        ArrayList<Integer> listaPares = new ArrayList<>();

        int somaPares = 0;

        for (int i = limiteInferior; i < limiteSuperior; i++) {

            if(i % 2 == 0) {
                listaPares.add(i);
                somaPares = somaPares + i;
            }

        }
        Collections.sort(listaPares);
        System.out.printf("Números pares informados: %s. \n", listaPares);
        System.out.printf("Soma dos números pares informados: %s.\n", somaPares);
        entrada.close();
    }
}
