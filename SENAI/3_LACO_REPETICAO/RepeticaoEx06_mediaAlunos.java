import java.util.Scanner;

public class RepeticaoEx06_mediaAlunos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contador = 1;
        int codigo = 1;

        while (codigo != 0) {

            System.out.printf("Informe o código do %sº aluno: \n", contador);
            codigo = entrada.nextInt();

            if (codigo == 0) {
                System.out.println("Programa finalizado! FIM");
                break;
            }

            contador++;

            float nota = 0;
            float soma = 0;
            float media = 0;

            for (int j = 1; j <= 3; j++) {
                System.out.printf("Informe a nota da %sª prova: \n", j);
                nota = entrada.nextFloat();

                if(nota >= 0 && nota <= 10) {
                    soma = soma + nota;
                } else {
                    System.out.println("ERRO: Nota inválida!");
                }

            }
            media = soma / 3;
            System.out.printf("Código aluno: %s \n", codigo);
            System.out.printf("Média do aluno: %s \n", media);
        }
        entrada.close();
    }
}
