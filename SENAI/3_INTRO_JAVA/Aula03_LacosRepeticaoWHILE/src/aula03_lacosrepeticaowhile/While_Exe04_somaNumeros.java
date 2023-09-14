
package aula03_lacosrepeticaowhile;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class While_Exe04_somaNumeros {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero = 0;
        int soma = 0;
        int contador = 1;
        
       
        while(true) {
            
            System.out.println("Informe um número inteiro OU digite zero para parar: ");
            numero = entrada.nextInt();
            
            if (numero == 0) {
                contador--;
                break;
            } else {
                contador++;
                soma = soma + numero;
            }
        }
        System.out.printf("A soma do %s números é: %s.", contador, soma);
        entrada.close();
    }
    
}
