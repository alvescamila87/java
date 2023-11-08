import java.util.Scanner;

public class Exe05_situacaoAlunos {
    public static void main(String[] args) {
        /*
         * Laço de repetição FOR
         * Crie um cadastro de 5 alunos que guarde o nome e 3 notas de cada aluno.
         * Ao final imprima em tela a média e a situação do aluno: notas abaixo de 6 “Reprovado”,
         * notas de 6 até abaixo de 7 “Em exame”, notas acima de 7 ou 7 “Aprovado”;
         */

        Scanner entrada = new Scanner(System.in);
        String nome = "";
        float nota = 0f;

        for (int i = 1; i <= 5; i++) {

            System.out.printf("Informe nome do %sº aluno: ", i);
            nome = entrada.next();

            float soma = 0;

            for (int j = 1; j <= 3; j++) {

                System.out.printf("Informe a nota da %sº prova: ", j);
                nota = entrada.nextFloat();

                if (nota >= 0 && nota <= 10.0) {
                    soma = soma + nota;
                } else {
                    System.out.println("ERRO: Nota inválida: número negativo ou nota acima de 10.0 não são permitidos.\n");
                    break;
                }

            }
            System.out.printf("Aluno: %s \n", nome);
            float media = soma / 3;

            System.out.printf("Média: %.1f \n", media);

            if (media < 6) {
                System.out.println("Situação do aluno: REPROVADO \n");
            } else if (media >= 6 && media < 7) {
                System.out.println("Situação do aluno: EM EXAME \n");
            } else {
                System.out.println("Situação do aluno: APROVADO \n");
            }
        }
    }
}
