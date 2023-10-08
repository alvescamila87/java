import java.util.Scanner;

public class RepeticaoEx15_tabuada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.printf("%s X %s = %s \n",i, j, i*j);

            }
            System.out.printf("\n");

            for (int j = 1; j <= 10; j++) {

                System.out.printf("%s : %s = %s \n",i*j, i, j);

            }
            System.out.printf("\n");

        }


    }
}
