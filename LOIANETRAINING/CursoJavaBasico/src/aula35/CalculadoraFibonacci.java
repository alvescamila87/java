package aula35;

// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-35

public class CalculadoraFibonacci {

    public static int fibonacci(int num) {

        if(num < 2) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
