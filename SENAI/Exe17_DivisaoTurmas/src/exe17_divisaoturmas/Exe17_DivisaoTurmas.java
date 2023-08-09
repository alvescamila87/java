/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe17_divisaoturmas;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe17_DivisaoTurmas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de alunos: ");
        int nAlunos = teclado.nextInt();
        
        int turmaA = nAlunos / 3;
        nAlunos = nAlunos - turmaA;
        
        int turmaB = nAlunos / 2;
        nAlunos = nAlunos - turmaB;
        
        int turmaC = nAlunos;
        
        System.out.printf("\nA turma A possui: %s alunos.", turmaA); 
        System.out.printf("\nA turma B possui: %s alunos.", turmaB);
        System.out.printf("\nA turma C possui: %s alunos.", turmaC);
                
                
            
    }
    
}
