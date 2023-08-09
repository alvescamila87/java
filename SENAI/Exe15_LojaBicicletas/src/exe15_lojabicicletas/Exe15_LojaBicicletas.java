/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe15_lojabicicletas;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe15_LojaBicicletas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Quantidade empregados da loja de bicileta
        System.out.println("Informe a quantidade de empregados da loja: ");
        int qtdEmpregados = teclado.nextInt();
        
        // Salário-mínimo
        System.out.println("Informe o valor do salário-mínimo: R$");
        float salarioMinimo = teclado.nextFloat();
                     
         // Quantidade biciletas
        System.out.println("Informe a quantidade de biciletas vendidas: ");
        int qtdBikes = teclado.nextInt();
        
        // Preço bicileta
        System.out.println("Informe o preço de custo da bicicleta: R$");
        float precoCustoBike = teclado.nextFloat();
                
        // Salario empregado
        float salarioEmpregado = (float) ((salarioMinimo * 2) + ((0.15 * precoCustoBike * qtdBikes) / qtdEmpregados));
        System.out.printf("\nO salário de cada empregado é de R$%.2f.", salarioEmpregado);
        
        // Vendas e Lucro da loja
        float precoVendaBike = (float) (precoCustoBike * 1.50);
        float lucro = (qtdBikes * (precoVendaBike - precoCustoBike)) - (salarioEmpregado * qtdEmpregados);
        System.out.printf("\nLucro da loja: R$%.2f", lucro);   
    }
    
}
