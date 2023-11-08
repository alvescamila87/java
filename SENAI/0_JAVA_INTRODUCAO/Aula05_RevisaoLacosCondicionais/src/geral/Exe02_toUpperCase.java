package geral;

import java.util.Scanner;

public class Exe02_toUpperCase {

    public static void main(String[] args) {
        /*
         * Estruta condicional if e Operador de comparação:
         * Faça um programa que verifique se uma letra digitada é “F” ou “M”.
         * Utilize a função ToUpperCase para transformar a entrada em maiúscula. Conforme a letra escrever:
         * F – Feminino,
         * M - Masculino,
         * Sexo inválido.
         */

        Scanner entrada = new Scanner(System.in);

        char sexo = 0;
        System.out.println("Informe o sexo [F/M]: ");
        sexo = entrada.next().charAt(0);

        // Converter para UPPERCASE
        char sexoUpperCase = Character.toUpperCase(sexo);

        if (sexoUpperCase == 'F') {
            System.out.printf("Sexo: %s - Feminino", sexoUpperCase);
        } else if (sexoUpperCase == 'M') {
            System.out.printf("Sexo: %s - Masculino", sexoUpperCase);
        } else {
            System.out.println("[ERRO] Sexo inválido!");
        }
        entrada.close();
    }
}
