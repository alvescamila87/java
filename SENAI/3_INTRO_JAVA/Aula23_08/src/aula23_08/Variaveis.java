
package aula23_08;

public class Variaveis {
    
    public static void main(String[] args) {
        // Variáveis tipos primitivos
        char sexo = 'F';
        System.out.printf("Sexo: %s\n", sexo);
        
        byte codigo = 120;
        System.out.printf("Código: %s\n", codigo);
        
        short qtdPecas = 32154;
        System.out.printf("Quantidade de peças: %s\n", qtdPecas);
        
        int valorA = 5;
        int valorB = 4;
        int total = valorA + valorB;
        
        System.out.printf("A soma de A(%s) + B(%s) é: %s\n", valorA, valorB, total);
        
        float valor_Total = 15.75f;
        System.out.printf("O valor total é: R$%s\n", valor_Total);
        
        double kmRodado = 75.987;
        System.out.printf("Km rodada: %s\n", kmRodado);
        
        long n = 123456789963258741L;
        System.out.printf("n: %s\n", n);
        
        boolean aberto = true;
        System.out.printf("A loja está aberta: %s\n", aberto);
        
        long g = 12365478932145L;
        byte x = (byte) g;
        System.out.printf("X com LONG: %s", x);
        
        byte b = 10;
        short y = (short)b;
        System.out.println("\nShort: " + y);
        
        
        String aluno = "O rato roeu a roupa do rei de Roma.";
        System.out.println(aluno);
    }
    
}
