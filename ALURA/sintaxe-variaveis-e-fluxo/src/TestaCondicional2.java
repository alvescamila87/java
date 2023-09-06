
public class TestaCondicional2 {
    
    public static void main(String[] args) {
        System.out.println("testando condicionais 2");
        int idade = 20;
        int quantidadePessoas = 3;
//      boolean acompanhado = true;
        boolean acompanhado = quantidadePessoas >= 2;
        
        System.out.println("valor de acompanhado = " + acompanhado);
        if (idade >= 18 && acompanhado) {
            System.out.println("Seja bem-vindo!");
        } else {
            System.out.println("Infelizmente você não pode entrar!");
        }
    }
    
}
