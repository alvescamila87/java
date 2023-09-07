package exe24_maiorvalor;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe24_MaiorValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        int contador = 0;
        int maiorValor = 0;
        int menorValor = 0;
              
       
        while (contador < 10)  {
            
            System.out.printf("Informe um valor inteiro para N%s: ", contador+1);
            int valor = entrada.nextInt();
            contador = contador + 1;
            
            if (contador == 1) {
                maiorValor = valor;
                menorValor = valor;
            } else if (valor > maiorValor) {
                maiorValor = valor;
            } else if (valor < menorValor) {
                menorValor = valor;  
            }
                   
        }         
        // Saída de dados:
        System.out.printf("Maior valor é: %s.\n", maiorValor);
        System.out.printf("Menor valor é: %s.\n", menorValor);
        
        entrada.close();
    }
    
}