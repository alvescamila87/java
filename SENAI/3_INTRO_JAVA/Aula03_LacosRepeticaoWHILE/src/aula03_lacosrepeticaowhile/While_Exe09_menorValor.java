/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula03_lacosrepeticaowhile;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class While_Exe09_menorValor {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero = -1;
        int contador = 0;
        int soma = 0;
        int menorValor = Integer.MAX_VALUE;
        
        do {
            System.out.println("Informe um número inteiro OU digite zero para parar");
            numero = entrada.nextInt();
            soma = soma + numero;
            contador = contador + 1;
            
            if (numero == 0) {
                contador--;
                break;
            } else {
                if (contador == 1) {
                    menorValor = numero;
                }
                else if (numero < menorValor) {
                    menorValor = numero;                    
                }
            }
        } while (numero != 0);
        System.out.printf("Total de números %s. Menor valor: %s. \n", contador, menorValor);
        

        
    }
    
}
