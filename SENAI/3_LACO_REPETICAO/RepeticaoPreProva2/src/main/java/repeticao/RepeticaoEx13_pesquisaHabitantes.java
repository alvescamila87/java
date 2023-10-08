package repeticao;

import java.util.Scanner;

public class RepeticaoEx13_pesquisaHabitantes {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        float somaSalarioM = 0;
        int contadorM = 0;
        float somaSalarioF = 0;
        int contadorF = 0;
        Integer idadeMaisVelhoM = Integer.MIN_VALUE;
        Integer idadeMaisNovaF = Integer.MAX_VALUE;


        while (true) {

            System.out.printf("Informe a idade do %sº habitante: ", contador+1);
            int idade = entrada.nextInt();

            if (idade == 0) {
                System.out.println("Fim programa!");
                break;
            } else if (idade < 0) {
                System.out.println("ERRO: Idade negativa é inválido.");
                break;
            }

            System.out.printf("Informe o sexo do %sº habitante [F/M]: ", contador+1);
            char sexo = entrada.next().charAt(0);
            sexo = Character.toUpperCase(sexo);


            if (sexo != 'F' && sexo != 'M') {
                System.out.println("ERRO: Sexo inválido. Digite apenas 'M' ou 'F'.");
                break;
            }

            System.out.printf("Informe o salário do %sº habitante: R$", contador+1);
            float salario = entrada.nextFloat();

            if (salario < 0) {
                System.out.println("ERRO: Salário negativo não á válido.");
                break;
            }

            contador++;

            // a) a média de salário dos homens;

            if (sexo == 'M') {
                somaSalarioM = somaSalarioM + salario;
                contadorM++;
            }

            // b) a média de salário das mulheres;

            if (sexo == 'F') {
                somaSalarioF = somaSalarioF + salario;
                contadorF++;
            }


            // d) o homem mais velho;

            if (sexo == 'M' && idade > idadeMaisVelhoM) {
                idadeMaisVelhoM = idade;
            }

            // e) a mulher mais nova;

            if (sexo == 'F' && idade < idadeMaisNovaF) {
                idadeMaisNovaF = idade;
            }

        }
        System.out.printf("A média de salário dos HOMENS é de R$%.2f \n", somaSalarioM / contadorM);
        System.out.printf("A média de salário das MULHERES é de R$%.2f \n", somaSalarioF / contadorF);

        // c) a média de salário do grupo;
        System.out.printf("A média de salário dos GRUPO é de R$%.2f \n", (somaSalarioM + somaSalarioF) / contador);

        System.out.printf("O homem mais velho tem %s anos. \n", idadeMaisVelhoM);
        System.out.printf("A mulher mais nova tem %s anos. \n", idadeMaisNovaF);

        entrada.close();

    }
}
