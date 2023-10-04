import java.util.Scanner;

public class RepeticaoEx03_imprimeDivisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;

        System.out.println("Informe um número de 1 a 9 para gerar tabuada da divisão: ");
        int tabuada = entrada.nextInt();

        while (contador <= 10) {
            if (tabuada <= 0) {
                System.out.println("[ERRO] Divisão por zero OU números negativos não são válidos.");
                break;
            }
            System.out.printf("%s : %s = %s \n", tabuada * contador, tabuada, contador);
            contador++;
        }
        entrada.close();
    }
}
