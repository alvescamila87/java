
public class RepeticaoEx19_escreverIOIOConsole {
    public static void main(String[] args) {

        for (int linha = 1; linha <= 4; linha++) {

            for (int conjunto = 0; conjunto < 4; conjunto++) {

                for (int unidade = 0; unidade < 5; unidade++) {

                    if(linha > 1 && linha < 4 ) {

                        if (conjunto == 0 || conjunto == 2) {

                            if (unidade < 1 || unidade > 3) {
                                System.out.print(" ");
                            }
                            else {
                                System.out.print("*");
                            }
                        }
                        else {
                            if (unidade < 1 || unidade > 3) {
                                System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                        }
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