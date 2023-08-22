
package exe05;

import java.util.Scanner;


public class Exe05 {


    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        int contador = 0;
        int maior = 0;
        int menor = 0;
                
        while (contador < 10) {
            System.out.printf("Informe um valor inteiro para N%s : ", contador + 1);
            int n = entrada.nextByte();
            contador += 1;
            
            if (contador == 1) {
                maior = n;
                menor = n;
            } else {
                if (n > maior) {
                    maior = n;
                }
                if (n < menor) {
                    menor = n;
                }
            }
        } // Saída de dados
        System.out.printf("O maior número informado foi: %s.\n", maior);
        System.out.printf("O menor número informado foi: %s.\n", menor);
    }
    
}
