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
        int turmaC = 60;
        int turmaD = 20;
        
        // Percentual de alunos reprovados na turma C
        System.out.println("Informe o percentual de alunos REPROVADOS na 'Turma C': ");
        float percentualC = teclado.nextFloat();
        int reprovadosC = (int) (turmaC * percentualC /100);
        int aprovadosC = turmaC - reprovadosC;
        
        
        // Percentual de alunos aprovados na turma D
        System.out.println("Informe o percentual de alunos APROVADOS na 'Turma D': ");
        float percentualD = teclado.nextFloat();
        int aprovadosD = (int) (turmaC * percentualD / 100);
        int reprovadosD = turmaD - aprovadosD;
        
        
        // Percentual de alunos reprovados em relação ao total de alunos das duas turmas
        int totalAlunos = (int) (turmaC + turmaD);
        int totalReprovados = (int) (reprovadosC + reprovadosD) * 100 / totalAlunos;
        
        
        //Respostas:
        System.out.printf("\n Turma C: Total de alunos: %s Total de reprovados: %s.", turmaC, reprovadosC);
        System.out.printf("\n Turma D: Total de alunos: %s Total de reprovados: %s.", turmaD, reprovadosD);
        System.out.printf("\n Há %s por cento de alunos reprovados em relação ao total de alunos: %s.", totalReprovados, totalAlunos);
    }
    
}
