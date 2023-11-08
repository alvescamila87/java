
package operadoresCondicionais;


public class Exe06 {
    public static void main(String[] args) {
        // Processamento de dados
        
        // Cálculo da média 1
        int n1 = 8;
        int n2 = 9;
        int n3 = 7;
        float media1 = (n1 + n2 + n3) / 3;
        
        // Cálculo da média 2
        int n4 = 4;
        int n5 = 5;
        int n6 = 6;
        float media2 = (n4 + n5 + n6) / 3;
        
        // Soma das médias 1 e 2
        float somaMedias = media1 + media2;
        
        // Média das médias 1 e 2
        float mediaGeral = (media1 + media2) / 2;
        
        // Saída de dados:
        System.out.printf("Os números: %s, %s, %s tem média: %.1f \n", n1, n2, n3, media1);
        System.out.printf("Os números: %s, %s, %s tem média: %.1f\n", n4, n5, n6, media2);
        System.out.printf("A soma das duas médias é: %.1f\n", somaMedias);
        System.out.printf("A média geral das duas médias é: %.1f\n", mediaGeral);       
    }
    
}
