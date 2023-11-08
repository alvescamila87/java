
package aula06_lacosderepeticao;

import java.util.Scanner;

public class Ex01_tomarChopp {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int contador = 1;
        
        System.out.println("Deseja tomar um chopp? ");
        char opcao = entrada.next().charAt(0);        
        opcao = Character.toUpperCase(opcao);
        
        if (opcao == 'S') {       
            while (opcao == 'S') {
                contador++;
                
                System.out.println("Deseja tomar MAIS um chopp? ");
                opcao = entrada.next().charAt(0); 
                opcao = Character.toUpperCase(opcao);
                
                if (opcao == 'N') {
                    System.out.println("Programa finalizado!");
                }
            }
            System.out.printf("Quantidade de chopps tomados: %s. \n", contador);       
        } else {
            System.out.println("Programa finalizado!");
        }
    
    }
}
