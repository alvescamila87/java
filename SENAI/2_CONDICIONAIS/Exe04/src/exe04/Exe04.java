
package exe04;

import java.util.Scanner;


public class Exe04 {


    public static void main(String[] args) {
        // Entrada de dados
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a idade para verificar a permissão de entrada: ");
        int idade = entrada.nextInt();
        
        // Processamento de dados
        
        if (idade >= 18) {
            // Saída de dados
            System.out.printf("Entrada permitida para: %s anos.", idade);
        } else {
            // Saída de dados
            System.out.printf("Entrada NÃO permitida para: %s anos.", idade);
        }
        
        
    }
    
}
