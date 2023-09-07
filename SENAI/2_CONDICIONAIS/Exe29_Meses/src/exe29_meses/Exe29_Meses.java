/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe29_meses;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe29_Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        System.out.println("Informe o número do mês: ");
        int mes = entrada.nextInt();
        
        switch(mes) {
            case 1: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Janeiro'.", mes);
            break;
            case 2: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Fevereiro'.", mes);
            break;
            case 3: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Março'.", mes);
            break;
            case 4: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Abril'.", mes);
            break;
            case 5: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Maio'.", mes);
            break;
            case 6: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Junho'.", mes);
            break;
            case 7: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Julho'.", mes);
            break;
            case 8: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Agosto'.", mes);
            break;
            case 9: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Setembro'.", mes);
            break;
            case 10: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Outubro'.", mes);
            break;
            case 11: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Novembro'.", mes);
            break;
            case 12: System.out.printf("O número: '%s' escrito por inteiro é o mês: 'Dezembro'.", mes);
            break;
            default: System.out.printf("[OPÇÃO INVÁLIDA] O número informado: %s não corresponde a um mês.", mes);
        }
            
        entrada.close();
    }
    
}
