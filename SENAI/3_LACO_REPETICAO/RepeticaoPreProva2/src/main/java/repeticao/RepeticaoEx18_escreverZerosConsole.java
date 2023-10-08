package repeticao;

public class RepeticaoEx18_escreverZerosConsole {
    public static void main(String[] args) {

        for (int linha = 1; linha <= 4; linha++) {

            for (int conjunto = 0; conjunto < 4; conjunto++) {

                for (int unidade = 0; unidade < 5; unidade++) {

                    if(linha > 1 && linha < 4 && unidade > 0 && unidade < 4) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }

                }
                System.out.print(" ");

            }
            System.out.print("\n");
        }
    }
}