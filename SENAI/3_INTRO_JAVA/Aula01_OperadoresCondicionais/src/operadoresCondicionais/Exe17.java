
package operadoresCondicionais;

import java.util.Scanner;
import java.util.Date ;

/**
 *
 * @author camila_alves3
 */
public class Exe17 {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o DIA de nascimento [DD]: ");
        int dia = entrada.nextInt();
        
        System.out.println("Informe o MÊS de nascimento [MM]: ");
        int mes = entrada.nextInt();
        
        System.out.println("Informe o ANO de nascimento [AAAA]: ");
        int ano = entrada.nextInt();
        
        // Processamento de dados
        if (dia > 31 || dia < 0) {
            System.out.println("[ERRO: Dia não pode ser maior que 31 OU valor negativo.");
        } 
        else if (mes > 12 || mes < 0) {
            System.out.println("[ERRO: Mês não pode ser maior que 12 OU valor negativo.");
        }
        else if (ano < 0) {
            System.out.println("[ERRO: Ano não pode ser valor negativo.");
        }
        else {
            // Saída de dados
            System.out.printf("A data de nascimento informada foi: dia %s do mês %s de %s.\n", dia, mes, ano);
        }
                
        
      
        entrada.close();
        
    }
    
}
