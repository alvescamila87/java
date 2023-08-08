/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe14_rendimentotaxi;

import java.util.Scanner;

/**
 *
 * @author Camila
 */
public class Exe14_RendimentoTaxi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // marcação do odometro(km)
        System.out.println("Informe a KM inicial: ");
        int kmInicial = teclado.nextInt();
        System.out.println("Informa o KM final: ");
        int kmFinal = teclado.nextInt();
        int kmTotal = kmFinal - kmInicial;
        
        // litros de combustível gasto
        System.out.println("Combustível consumido: (lts) ");
        float gasGasto = teclado.nextFloat();
        float kmLitro = kmTotal / gasGasto;
        
        // total recebido dos passageiros
        System.out.println("Informe o total recebido dos passageiros: R$");
        float valorCorridas = teclado.nextFloat();
        
        // lucro liquido
        float preco = (float) 2.50;
        float lucro = valorCorridas - (gasGasto * preco);
        
        // Respostas:
        System.out.printf("\n %s km percorridos.", kmTotal);
        System.out.printf("\nCombustível gasto %s. lts", gasGasto);
        System.out.printf("\nConsumo %s por km rodados", kmLitro);
        System.out.printf("\nR$%.2f recebidos dos passageiros.", valorCorridas);
        System.out.printf("\nR$%.2f lucro do dia.", lucro);
        
    }
    
}
