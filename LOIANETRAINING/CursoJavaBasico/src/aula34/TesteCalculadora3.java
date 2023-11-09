package aula34;

public class TesteCalculadora3 {

    static int resultSoma;
    public static void main(String[] args) {

        resultSoma = MinhaCalculadora2.soma(1,2);

        //MinhaCalculadora2 calc = new MinhaCalculadora2();

        //calc.soma(1,2);
        //calc.soma(1,2,3);
        //calc.soma(1.0,1.3);

        soma2Valores(1,2);

    }

    static int soma2Valores(int num1,int num2) {
        return MinhaCalculadora2.soma(num1, num2);
    }
}
