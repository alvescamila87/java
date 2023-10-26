
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex07_vetor_notasAlunos2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a quantidade de alunos da turma: ");
        int qtdAlunosTurma = entrada.nextInt();
        
        String[] alunosNomes = new String[qtdAlunosTurma];
        double[] alunosNotas = new double[alunosNomes.length * 3];
        double[] alunosMedia = new double[alunosNomes.length];
        
        for (int contadorAluno = 0; contadorAluno < alunosNomes.length; contadorAluno++) {
            
        }
        
    }
    
}
