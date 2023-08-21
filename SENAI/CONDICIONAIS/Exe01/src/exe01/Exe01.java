
package exe01;

import java.util.Scanner;

public class Exe01 {

    
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();
                
        // Processamento de dados
        if (idade < 18) {
            // Saída de dados
            System.out.printf("%s anos é 'Menor de idade'.", idade);
        }
        else if (idade >= 18 && idade >= 65) {
            // Saída de dados
            System.out.printf("%s anos é 'Maior de idade'.", idade);
        } 
        else {
            // Saída de dados
            System.out.printf("%s anos é 'Idoso'.", idade);
        }
    }
    
}
