package aula50;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args) {

        System.out.println("Entre com um número decimal: ");

        try {
            double num = leNumero();
            System.out.println("Você digitou: " + num);
        } catch (Exception e) {
            System.out.println("Entrada de dado inválida!"); // mensagem amigável ao usuário
            e.printStackTrace(); // incluir isso no log de erro ao invés de colocar no console
        }

    }

    public static double leNumero() throws Exception{

        Scanner entrada = new Scanner(System.in);

        double numero = entrada.nextDouble();

        return numero;
    }
}
