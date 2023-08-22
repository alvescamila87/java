
package exe03;

import java.util.Scanner;


public class Exe03 {


    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o peso: ");
        float peso = entrada.nextFloat();
        
        System.out.println("Informe a altura: ");
        float altura  = entrada.nextFloat();
        
        // Processamento de dados
        float imc = peso / (altura * altura);
        
        if (imc <= 18.5) {
            // Saída de dados
            System.out.printf("%s kg tem a Classificação de IMC: 'ABAIXO DO PESO'.", imc);
        } else if (imc >= 18.6 && imc <= 24.9) {
            // Saída de dados
            System.out.printf("%s kg tem a Classificação de IMC: 'PESO IDEAL (PARABÉNS)'.", imc); 
        } else if (imc >= 25 && imc <= 29.9) {
            // Saída de dados
            System.out.printf("%s kg tem a Classificação de IMC: 'LEVEMENTE ACIMA DO PESO'.", imc);  
        } else if (imc >= 30 && imc <= 34.9) {
            // Saída de dados
            System.out.printf("%s kg tem a Classificação de IMC: 'OBESIDADE GRAU I'.", imc);  
        } else if (imc >= 35 && imc <= 39.9) {
            // Saída de dados
            System.out.printf("%s kg tem a Classificação de IMC: 'OBESIDADE GRAU II (SEVERA)'.", imc);  
        } else {
            // Saída de dados
            System.out.printf("%s kg tem a Classificação de IMC: 'OBESIDADE GRAU III (MÓRBIDA)'.", imc);  
        }
    
    }
    
}
