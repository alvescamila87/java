
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex07_vetor_notasAlunos2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos da turma: ");
        int qntAlunos = entrada.nextInt();

        String[] alunosNomes = new String[qntAlunos];
        double[] alunosNotas = new double[alunosNomes.length * 3];
        double[] alunosMedia = new double[alunosNomes.length];
        int contadorTurma = 0;
        double somaNotas = 0;

        for (int contadorAlunos = 0; contadorAlunos < alunosNomes.length; contadorAlunos++) {

            System.out.printf("Informe o nome do %s aluno(a): \n", contadorAlunos + 1);
            alunosNomes[contadorAlunos] = entrada.next();

            for (int contadorNotas = 0; contadorNotas < 3; contadorNotas++) {

                System.out.printf("Informe a %s nota do aluno(a) %s: \n", contadorNotas + 1, alunosNomes[contadorAlunos]);
                alunosNotas[contadorTurma] = entrada.nextDouble();

                somaNotas = somaNotas + alunosNotas[contadorTurma];
                contadorTurma++;
            }

            alunosMedia[contadorAlunos] = somaNotas / 3;
            //System.out.println("Aluno(a): " + alunosNomes[contadorAlunos] + " Média: " + alunosMedia[contadorAlunos]);
            somaNotas = 0;
        }
        for (int contadorAlunos = 0; contadorAlunos < alunosNomes.length; contadorAlunos++) {

            System.out.println("Aluno(a): " + alunosNomes[contadorAlunos]);
            
            for (int contadorNotas = 0; contadorNotas < 3; contadorNotas++) {
                
                System.out.println("Notas: " + alunosNotas[contadorAlunos]);
                contadorTurma++;
            }
            
            System.out.println("Média: " + alunosMedia[contadorAlunos]);
            
            if (alunosMedia[contadorAlunos] >= 7) {
                System.out.println("Classificação: APROVADO!");
            } else if (alunosMedia[contadorAlunos] <= 6 && alunosMedia[contadorAlunos] < 7) {
                System.out.println("Classificação: EM EXAME!");
            } else {
                System.out.println("Classificação: REPROVADO!");
            }
        }
    }
}