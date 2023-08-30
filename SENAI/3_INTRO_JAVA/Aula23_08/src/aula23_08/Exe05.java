
package aula23_08;

import java.util.Scanner;


public class Exe05 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a idade em anos:");
        int anos = entrada.nextInt();
        System.out.println("Informe a idade em meses: ");
        int meses = entrada.nextInt();
        System.out.println("Informe a idade em dias: ");
        int dias = entrada.nextInt();
        
        // Processamento de dados
        int conversaoDias = anos * 365 + meses * 30 + dias;
        
        // Saída de dados:
        System.out.printf("Idade informada em anos %s, %s meses %s dias \n", anos, meses, dias);
        System.out.printf("corresponde a um total de: %s dias.\n", conversaoDias);
        
        // Fechamento de Scanner
        entrada.close();
    }
    
}
