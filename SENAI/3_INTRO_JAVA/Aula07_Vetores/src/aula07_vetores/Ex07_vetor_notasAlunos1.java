
package aula07_vetores;

import java.util.Scanner;

/**
 *
 * @author Camila
 */

public class Ex07_vetor_notasAlunos1 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);

        // Definição do tamanho de vetor de alunos
        System.out.println("Informe quantos alunos deseja cadastrar: ");
        int qtdAlunos = entrada.nextInt();

        String[] alunosNomes  = new String[qtdAlunos];
        double[] alunosNotas = new double[alunosNomes.length * 3];
        double[] alunosMedias = new double[alunosNomes.length];
        double soma = 0;
        int contadorNotas = 0;
        
        // Informar nome e as 3 notas de cada aluno
        for (int contadorAluno = 0; contadorAluno < alunosNomes.length; contadorAluno++) {
            
            System.out.printf("Informe o nome do %sº aluno: \n", contadorAluno + 1);
            alunosNomes[contadorAluno] = entrada.next();
            
               
            for (int contadorNotasProva = 0; contadorNotasProva < 3; contadorNotasProva++) {
                    
                System.out.printf("Informe a %sª nota do aluno %s: \n", contadorNotas + 1, alunosNomes[contadorAluno]);
                alunosNotas[contadorNotas] = entrada.nextDouble();
                System.out.println(alunosNotas[contadorNotas]);
                
                soma = soma + alunosNotas[contadorNotas];
                contadorNotas++;
                //System.out.println(contadorNotas);
            } 
            alunosMedias[contadorAluno] = soma / 3;
            soma = 0;
      
        }

            

    }  
        

}
