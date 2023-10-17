
package aula06_lacosderepeticao;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Ex02_calcularMedia {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int idade = 1;
        int contador = 1;
        int soma = 0;
        int media = 0;
        
        while (idade != 0) {
            
            System.out.printf("Informe a idade da %sª pessoa OU digite '0' (zero) para sair: ", contador);
            idade = entrada.nextInt();
            
            if (idade == 0 || idade < 0) {
                System.out.println("Programa finalizado.");
                contador--;
                break;
            }
            
            soma = soma + idade;
            contador++;            
            
        }
        media = soma / contador;
        System.out.printf("A média de idade das %s pessoas informadas é de: %s anos. \n", contador, media);
        
    }
    
}
