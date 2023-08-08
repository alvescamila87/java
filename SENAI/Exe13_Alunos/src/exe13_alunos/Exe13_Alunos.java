/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe13_alunos;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe13_Alunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        // Quantidade de alunos nas turmas:
        float turma_c = 60;
        float turma_d = 20;
        
        // Percentual de alunos reprovados na turma C
        System.out.println("Informe o percentual de alunos REPROVADOS na 'Turma C': ");
        float percentual_c = teclado.nextFloat();
        float reprovados_c = 100 / (turma_c * percentual_c);
        float aprovados_c = turma_c - reprovados_c;
        
        
        // Percentual de alunos aprovados na turma D
        System.out.println("Informe o percentual de alunos APROVADOS na 'Turma D': ");
        float percentual_d = teclado.nextFloat();
        float aprovados_d = 100 / (turma_d * percentual_d);
        float reprovados_d = turma_d - aprovados_d;
        
        
        // Percentual de alunos reprovados em relação ao total de alunos das duas turmas
        float totalAlunos = (int) (turma_c + turma_d);
        float totalReprovados = (int) (reprovados_c + reprovados_d) * 100 / totalAlunos;
        
        
        //Respostas:
        System.out.printf("\n Turma C: Total de alunos: %.0f. Total de reprovados: %.0f", turma_c, reprovados_c);
        System.out.printf("\n Turma D: Total de alunos: %.0f. Total de reprovados: %.0f.", turma_d, reprovados_d);
        System.out.printf("\n Há %.2f por cento de alunos reprovados em relação ao total de alunos: %.0f", totalReprovados, totalAlunos);
    }
    
}
