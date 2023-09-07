/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe33_diasemana;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe33_DiaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe um número de 1 a 7: ");
        int semana = entrada.nextInt();
        
        switch(semana) {
            case 1: System.out.printf("O número: '%s' representa o dia da semana: 'Domingo'.\n", semana);
            break;
            case 2: System.out.printf("O número: '%s' representa o dia da semana: 'Segunda-feira'.\n", semana);
            break;
            case 3: System.out.printf("O número: '%s' representa o dia da semana: 'Terça-feira'.\n", semana);
            break;
            case 4: System.out.printf("O número: '%s' representa o dia da semana: 'Quarta-feira'.\n", semana);
            break;
            case 5: System.out.printf("O número: '%s' representa o dia da semana: 'Quinta-feira'.\n", semana);
            break;
            case 6: System.out.printf("O número: '%s' representa o dia da semana: 'Sexta-feira'.\n", semana);
            break;
            case 7: System.out.printf("O número: '%s' representa o dia da semana: 'Sábado'.\n", semana);
            break;
            default: System.out.printf("ERRO: opção inválida. Tente novamente.\n");
        }
            
        entrada.close();
    }
    
}
