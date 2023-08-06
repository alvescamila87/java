/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposprimitivos;

// Entrada de dados (Scanner)
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Entrada de dados (Scanner)        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe o nome: ");
        String nome = teclado.nextLine();
        
        System.out.println("Digite a idade: ");
        int idade = teclado.nextInt();
        
        System.out.println("Informe a nota: ");
        float nota = teclado.nextFloat();
                
        // SAÍDA DE DADOS
       
        // PRINTF: com formatação
        System.out.printf("A nota de %s, com %s anos, é %.2f", nome,idade, nota);      
        
        // Inconformidade de tipos string e inteiro
        // Utilizar classe involucra (wrapper class)
        
        /* Opção 1:
            int idade2 = 30;
            String valor = Integer.toString(idade2);
            System.out.println(valor);
        */
        
        // Opção 2:
        String valor = "30";
        int idade2 = Integer.parseInt(valor);
        System.out.println(idade2);
        
        // Também pode ser feito para os reais
        String salario = "3000.50";
        float valor2 = Float.parseFloat(salario);
        System.out.println(valor2);
        
    }
    
}
