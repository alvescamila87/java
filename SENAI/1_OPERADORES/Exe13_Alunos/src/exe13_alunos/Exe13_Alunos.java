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
        int turma_c = 60;
        int turma_d = 20;
        
        // Percentual de alunos reprovados na turma C
        System.out.println("Informe o percentual de alunos REPROVADOS na 'Turma C': ");
        float percentual_c = teclado.nextFloat();
        int reprovados_c = (int) (turma_c * percentual_c /100);
        int aprovados_c = turma_c - reprovados_c;
        
        
        // Percentual de alunos aprovados na turma D
        System.out.println("Informe o percentual de alunos APROVADOS na 'Turma D': ");
        float percentual_d = teclado.nextFloat();
        int aprovados_d = (int) (turma_c * percentual_d / 100);
        int reprovados_d = turma_d - aprovados_d;
        
        
        // Percentual de alunos reprovados em relação ao total de alunos das duas turmas
        int totalAlunos = (int) (turma_c + turma_d);
        int totalReprovados = (int) (reprovados_c + reprovados_d) * 100 / totalAlunos;
        
        
        //Respostas:
        System.out.printf("\n Turma C: Total de alunos: %s Total de reprovados: %s.", turma_c, reprovados_c);
        System.out.printf("\n Turma D: Total de alunos: %s Total de reprovados: %s.", turma_d, reprovados_d);
        System.out.printf("\n Há %s por cento de alunos reprovados em relação ao total de alunos: %s.", totalReprovados, totalAlunos);
    }
    
}
