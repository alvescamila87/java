package aula03_lacosrepeticaowhile;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class While_Exe01_mediaDeIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Faça um programa que receba a idade de várias pessoas e calcule a média. O programa
        //deve parar de pedir a idade quando o usuário digitar a idade -1.
        
        Scanner teclado = new Scanner (System.in);
        
        int idade = 0;
        int contador = 0;
        int soma = 0;
        int mediaIdade = 0;
               
        while (idade != -1) {
            System.out.println("Informe a idade ou digite -1 para parar: ");
            idade = teclado.nextInt();                                  
            
            if (idade == -1) {
                break;
            } else {
                contador = contador + 1;
                soma = soma + idade;
                mediaIdade = soma / contador;
            }
        }
        System.out.printf("Total de pessoas: %s. Média da idade: %s. \n", contador, mediaIdade);
        
        teclado.close();
    }
    
}
