
package operadoresCondicionais;

import java.util.Scanner;


public class EntradaDados {
    
    public static void main(String[] args) {
        // Entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome do aluno: ");
        String aluno = entrada.nextLine();
        
        System.out.println("Informe a idade: ");
        int idade = entrada.nextInt();
        
        System.out.println("Informe a 'primeira letra' do nome do aluno: ");
        char caracter = entrada.next().charAt(0);
        
        System.out.printf("Com '%s': há o(a) aluno(a):  %sc, com: %s anos.\n", caracter, aluno, idade);
        // Fechar Scanner Entrada de dados
        entrada.close();
    }
    
}
