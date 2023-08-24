
package aula23_08;

import java.util.Scanner;


public class Exe01 {
    public static void main(String[] args) {
        /* 
            Exercício 01 - Desenvolva um algoritmo que receba:
             o valor da base e da altura de um triângulo e mostre sua área.
             A área do triangulo retângulo é calculada por meio da formula: area = (base *
            altura) / 2.
        */
        
        // Entrada de dados
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a base do triângulo (cm): ");
        float base = entrada.nextFloat();
        
        System.out.println("Informe a altura do triângulo (cm): ");
        float altura = entrada.nextFloat();
        
        // Processamento de dados
        float area = (base * altura) / 2;
        
        // Saída de dados
        System.out.printf("A área do triângulo é de: %s cm².", area);
        
    }
}
