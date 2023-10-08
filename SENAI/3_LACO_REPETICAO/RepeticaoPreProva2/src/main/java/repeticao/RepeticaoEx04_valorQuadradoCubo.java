package repeticao;

import java.util.Scanner;

public class RepeticaoEx04_valorQuadradoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor inteiro limite: ");
        int valor = entrada.nextInt();

        int contador = 1;

        while (contador <= valor) {

            System.out.printf("Número: %s, Dobro: %s, Triplo: %s \n", valor, valor * valor, valor * valor * valor);
            valor--;
        }
        entrada.close();
    }
 }

