package aula02;

import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {

        //declaração:
        int idade = 20;
        String nome = "Camila";

        //camelCase
        String nomeCachorro = "Marlene";

        idade = 35;

        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
        System.out.println("Nome do cachorro: " + nomeCachorro);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        String nomeCompleto = entrada.nextLine();
        System.out.println("Nome completo: " + nomeCompleto);

        System.out.println("Informe seu primeiro nome: ");
        String primeiroNome = entrada.next();
        System.out.println("Primeiro nome: " + primeiroNome);




    }
}
