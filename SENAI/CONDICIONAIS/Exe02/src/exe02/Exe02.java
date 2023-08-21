package exe02;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe  idade para obter a classe eleitoral: ");
        int idade = entrada.nextInt();
        
        // Processamento de dados
        if (idade < 16) {
            // Saída de dados
            System.out.printf("%s anos tem Classe eleitoral: 'Não eleitor'.", idade);
        }
        else if (idade >=18 && idade <= 65) {
            // Saída de dados
            System.out.printf("%s anos tem Classe eleitoral: 'Eleitor obrigatório'.", idade);
        }
        else {
            // Saída de dados
            System.out.printf("%s anos tem Classe eleitoral: 'Eleitor facultativo'.", idade);
        }
    }
    
}
