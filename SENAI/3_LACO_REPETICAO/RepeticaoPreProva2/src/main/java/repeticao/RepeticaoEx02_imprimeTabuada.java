package repeticao;

import java.util.Scanner;

public class RepeticaoEx02_imprimeTabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 9 para gerar a tabuada: ");
        int tabuada = entrada.nextInt();

        int contador = 1;

        while (contador <= 10) {

            if (tabuada <= 0) {
                System.out.println("[ERRO] Multiplicação por zero OU números negativos não são válidos.");
                break;
            }

            System.out.printf("%s X %s = %s \n", tabuada, contador, tabuada * contador);
            contador++;
        }

        entrada.close();

    }
}
