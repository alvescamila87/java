package aula34;

public class Ex02_MinhaCalculadora {

    public static void main(String[] args) {

        imprimirTela(Calculadora.soma(1,2));
        imprimirTela(Calculadora.subtrair(2,1));
        imprimirTela(Calculadora.dividir(2,2));
        imprimirTela(Calculadora.dividir(4,2));
        imprimirTela(Calculadora.potencia(2,4));

    }

    static void imprimirTela(int num) {
        System.out.println(num);
    }
}
