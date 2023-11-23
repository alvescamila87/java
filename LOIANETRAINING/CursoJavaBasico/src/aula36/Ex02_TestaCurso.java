package aula36;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex02_TestaCurso {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Informe o nome do curso: ");
        String nome = entrada.nextLine();

        System.out.println("Informe o horário do curso: ");
        String horario = entrada.nextLine();

        System.out.println("Informe o nome do professor: ");
        String nomeProfessor = entrada.nextLine();

        System.out.println("Informe o departamento do professor: ");
        String departamentoProfessor = entrada.nextLine();

        System.out.println("Informe o email do professor: ");
        String emailProfessor = entrada.nextLine();

        Ex02_Curso curso = new Ex02_Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Ex02_Professor professor = new Ex02_Professor();
        professor.setNome(nomeProfessor);
        professor.setEmail(departamentoProfessor);
        professor.setDepartamento(emailProfessor);

        curso.setProfessor(professor);


        System.out.println("------ALUNOS-------");

        Ex02_Aluno[] alunos = new Ex02_Aluno[5];

        for (int i = 0; i < 5; i++) {

        //entrada.nextLine();

            System.out.println("Entre com o nome do aluno " + (i+1));
            String nomeAluno = entrada.nextLine();

            System.out.println("Informe a matrícula: ");
            String matriculaAluno = entrada.nextLine();

            double[] notas = new double[4];

            for (int j = 0; j < 4; j++) {

                System.out.println("Informe a " + (j+1) + "ª nota: ");
                notas[j] = entrada.nextDouble();

            }

            Ex02_Aluno aluno = new Ex02_Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matriculaAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;

        }

        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());

    }
}
