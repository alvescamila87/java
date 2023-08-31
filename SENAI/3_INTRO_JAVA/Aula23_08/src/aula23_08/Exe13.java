
package aula23_08;

import java.util.Scanner;

/**
 *
 * @author camila_alves3
 */
public class Exe13 {
    public static void main(String[] args) {
        //Dados
        
        // Identificador dos vendedores
        int idVendedor1 = 135;
        int idVendedor2 = 269;   
        
        // Código da peça
        int idProduto1 = 66;
        int idProduto2 = 88;
        
        // Preço unitário da peça
        float valorProduto1 = 42.90f;
        float valorProduto2 = 159.90f;
        
        // Quantidade vendida
        int qtdVendaProduto1 = 50;
        int qtdVendaProduto2 = 150;
        
        // Processamento de dados
        
        // Venda dos produtos
        float vendaProduto1 = qtdVendaProduto1 * valorProduto1;
        float vendaProduto2 = qtdVendaProduto2 * valorProduto2;
        float totalVendaProdutos = vendaProduto1 + vendaProduto2;
        
        // Comissao vendedor
        float percentualComissao = (float) ((float) totalVendaProdutos * (1.05 / 100));
        float comissaoPaga = percentualComissao / 2;
        
        // Valor líquido
        float valorLiquidoVendas = totalVendaProdutos - (comissaoPaga * 2);
        
        // Saída de dados:
        System.out.printf("Identificação: 'Cód Vendedor 2: %s' e 'Cód Vendedor 2: %s'. \n", idVendedor1, idVendedor2);
        System.out.printf("Peças: 'Cód Produto 1: %s' e 'Cód Produto 2: %s' \n", idProduto1, idProduto2);
        System.out.printf("Peças: 'Produto 1: R$%.2f' e 'Produto 2: R$%.2f'. \n", valorProduto1, valorProduto2);
        System.out.printf("Vendas: 'Produto 1: %s unidades' e 'Produto 2: %s unidades'. \n", qtdVendaProduto1, qtdVendaProduto2);
        System.out.printf("Total bruto de vendas: 'R$%.2f.' \n", totalVendaProdutos);
        System.out.printf("Comissão recebida por vendedor: 'R$%.2f.' \n", comissaoPaga);
        System.out.printf("Total líquido de vendas: 'R$%.2f.' \n", valorLiquidoVendas);
        
    }
    
}
