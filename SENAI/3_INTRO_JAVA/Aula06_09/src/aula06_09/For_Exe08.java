package aula06_09;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class For_Exe08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int contador = 0;
        int soma = 0;
        int media = 0;
        
        for(;;) {
            System.out.println("Informe um número inteiro ou digite -1 para parar: ");
            int valor = entrada.nextInt();
                        
            if (valor == -1) {
                break;
            } else {
                contador = contador + 1;
                soma = soma + valor;
                media = soma / contador;
            }
        }  
        System.out.printf("A média dos %s números digitados é: %s. \n", contador, media);
    
    }
}
