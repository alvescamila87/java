package aula33;

import aula26.Aluno2;

import java.util.Scanner;

public class TesteAluno {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do aluno: ");
        aluno.setNome(entrada.next());

        System.out.println("Entre com o ID da matrícula: ");
        aluno.setIdMatricula(entrada.next());

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.setNomeDisciplinaPosicao(i, entrada.next());
        }

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.getDisciplinas()[i]);

            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Entre com a nota " + (j+1));
                aluno.setNotaDisciplinaPosicaoIJ(i, j, entrada.nextDouble());

            }

        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getDisciplinas().length; i++) {
            if(aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi aprovado!");
            } else {
                System.out.println("Disciplina " + aluno.getDisciplinas()[i] + " - foi reprovado!");
            }
        }
    }
}
