
package exe07;

import java.util.Scanner;


public class Exe07 {


    public static void main(String[] args) {
        // Entrada de dados 
        
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        float soma = 0;
        float media = 0;
        
        while (contador < 3){
            System.out.printf("Informe a nota da Prova %s: ", contador + 1);
            float n = entrada.nextFloat();
            soma = soma + n;
            contador += 1;     
        }
        // Processamento de dados
            
        media = soma / contador;
        
        if (media < 3) {
           // Saída de dados
            System.out.printf("A média das provas é: %s . Classificação da média: 'REPROVADO'.\n", media);  
        } 
        else if (media < 7) {
           // Saída de dados
            System.out.printf("A média das provas é: %s . Classificação da média: 'EXAME'.\n", media);     
        } 
        else {
           // Saída de dados
           System.out.printf("A média das provas é: %s . Classificação da média: 'APROVADO'.\n", media); 
        }
                
    }
    
}
