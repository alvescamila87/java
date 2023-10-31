package aula26;

import java.util.Scanner;

public class TesteAluno1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Princesa Isabel";
        aluno1.idMatricula = "PI005";

        aluno1.disciplinas = new String[3];
        aluno1.notasDisciplinas = new double[3];

        for (int contador = 0; contador < aluno1.disciplinas.length; contador++) {
            System.out.printf("Informe o nome da %sº disciplina: ", contador + 1);
            aluno1.disciplinas[contador] = entrada.next();

            System.out.printf("Informe a nota da %sº disciplina: ", contador + 1);
            aluno1.notasDisciplinas[contador] = entrada.nextDouble();
        }


        aluno1.consultarAprovacao();
    }
}
