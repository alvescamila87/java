
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

            System.out.printf("Informe o nome do %sº aluno: \n", contadorAlunos + 1);
            alunosNomes[contadorAlunos] = entrada.next();

            for (int contadorNotas = 0; contadorNotas < 3; contadorNotas++) {

                System.out.printf("Informe a %sª nota do aluno %s: \n", contadorNotas + 1, alunosNomes[contadorAlunos]);
                alunosNotas[contadorTurma] = entrada.nextDouble();

                somaNotas = somaNotas + alunosNotas[contadorTurma];
                contadorTurma++;
            }

            alunosMedia[contadorAlunos] = somaNotas / 3;

            somaNotas = 0;
        }
        
        contadorTurma = 0;
        for (int contadorAlunos = 0; contadorAlunos < alunosNomes.length; contadorAlunos++) {

            System.out.println("Aluno: " + alunosNomes[contadorAlunos]);
            
            for (int contadorNotas = 0; contadorNotas < 3; contadorNotas++) {
                
                System.out.printf("%sº nota: %s \n", contadorNotas + 1, alunosNotas[contadorTurma]);
                contadorTurma++;
            }
            
            System.out.println("Média de notas: " + alunosMedia[contadorAlunos]);
            
            if (alunosMedia[contadorAlunos] >= 7) {
                System.out.println("Classificação: APROVADO");
            } else if (alunosMedia[contadorAlunos] >= 6 && alunosMedia[contadorAlunos] < 7) {
                System.out.println("Classificação: EM EXAME");
            } else {
                System.out.println("Classificação: REPROVADO");
            }
        }
    }
}