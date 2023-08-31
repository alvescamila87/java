
package aula23_08;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe11 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a cotação do dolar: USD");
        float dolar = entrada.nextFloat();
        
        System.out.println("Informe o valor total em dólares: USD");
        float qtdDolar = entrada.nextFloat();
        
        // Procesamento de dados
        float conversorReal = qtdDolar * dolar;
        
        // Saída de dados
        System.out.printf("USD%.2f correspondem a R$%.2f convertidos na cotação de %.2f.\n",qtdDolar, conversorReal, dolar);       
                    
        entrada.close();
    }
    
}
