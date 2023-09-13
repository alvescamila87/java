
package comprasapp;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe o limite do cartão de crédito R$");
        double limiteCartao = entrada.nextDouble();
        CartaoCredito cartao = new CartaoCredito(limiteCartao);
                
        int sair = 1; 
        while (sair != 0) { 
            System.out.println("Informe a descrição do produto: ");
            String nomeProduto = entrada.next();

            System.out.println("Informe o valor da compra R$");
            double valorProduto = entrada.nextDouble();
            
            Compra compra = new Compra(nomeProduto, valorProduto);
            boolean compraRealizada = cartao.lancaCompra(compra);
            
            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Informe a operação: ");
                System.out.println("[0] SAIR ");
                System.out.println("[1] CONTINUAR COMPRANDO");                    
                sair = entrada.nextInt();              
            } else {
                System.out.println("Saldo insuficiente!");
                sair = 0;
            }
            }
            System.out.println("****************************");
            System.out.println("COMPRAS REALIZADAS: \n");
            Collections.sort(cartao.getCompras());
            
            for (Compra c : cartao.getCompras()) {
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }
            System.out.println("****************************");
            
            System.out.println("\nSaldo do cartão de crédito: R$" + cartao.getSaldo());          
        }
        
    }
   
