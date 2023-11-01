package aula26;

import java.util.Scanner;

public class TesteAluno2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Aluno2 aluno = new Aluno2();

        System.out.println("Entre com o nome do aluno: ");
        aluno.nome = entrada.next();

        System.out.println("Entre com o ID da matrícula: ");
        aluno.idMatricula = entrada.next();

        for (int i = 0; i < aluno.disciplinas.length; i++) {
            System.out.println("Entre com o nome da disciplina " + i);
            aluno.disciplinas[i] = entrada.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas da disciplina " + aluno.disciplinas[i]);

            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = entrada.nextDouble();
                
            }
            
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            if(aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi aprovado!");
            } else {
                System.out.println("Disciplina " + aluno.disciplinas[i] + " - foi reprovado!");
            }
        }
    }
}
