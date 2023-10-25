package aula02;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o dia da semana de 1 a 7: ");
        int diaDaSemana = entrada.nextInt();

        switch (diaDaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia �til da semana."); break;
            case 1:
            case 7:
                System.out.println("Dia de final de semana."); break;
            default:
                System.out.println("N�mero inv�lido");
        }

    }
}