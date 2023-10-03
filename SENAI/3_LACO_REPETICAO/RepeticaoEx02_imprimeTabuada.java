import java.util.Scanner;

public class RepeticaoEx02_imprimeTabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um número de 1 a 9 para gerar a tabuada: ");
        int tabuada = entrada.nextInt();

        System.out.printf("Tabuada do '%s':\n", tabuada);

        for (int i = 1; i <= 10; i++) {

            System.out.printf("%s X %s = %S \n", tabuada, i, tabuada*i);

        }

    }
}
