package aula35;

public class Calculadora {

    //5! = 5 * 4 * 3 * 2 * 1 = 120
    //0! = 1
    //Não existe fatorial de números negativos
    public static int fatorialNaoRecursivo(int num) {

        if(num == 0) {
            return 1;
        }

        int total = 1;

        for (int i = num; i > 1; i--) {

            total = total * i;

        }

        return total;
    }

    //fatorial(5) = 5 * fatorial(4)
    //fatorial(4) = 4 * fatorial(3)
    //fatorial(3) = 3 * fatorial(2)
    //fatorial(2) = 2 * fatorial(1)
    //fatorial(1) = 1 * fatorial(0)
    //fatorial(0) = 1;
    public static int fatorial(int num) {

        if(num == 0) {
            return 1;
        }

        return num * fatorial(num - 1);
    }

    //5 = 5 + somatório(4)
    //4 = 4 + somatório(3)
    //3 = 3 + somatório(2)
    //2 = 2 + somatório(1)
    //1 = 1

    public static int somatorio(int num) {

        if(num == 1) {
            return 1;
        }

        return num + somatorio(num - 1);

    }
}
