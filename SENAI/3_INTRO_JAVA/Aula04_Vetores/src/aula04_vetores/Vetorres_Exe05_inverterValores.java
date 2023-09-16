package aula04_vetores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Vetorres_Exe05_inverterValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Informe o %sº valor do vetor: ", i+1);
            int numero = entrada.nextInt();
            listaNumeros.add(numero);
        }
        
        // Imprimir ANTES Da inversão da lista
        System.out.println("ANTES DA INVERSÃO- Lista de números: " + listaNumeros);  
        
        // Inverter a lista usando a classe Collections
        Collections.reverse(listaNumeros);
        
        // Imprimir APÓS a inversão da lista
        System.out.println("DEPOIS DA INVERSÃO - Lista de números: " + listaNumeros);
    }
}

