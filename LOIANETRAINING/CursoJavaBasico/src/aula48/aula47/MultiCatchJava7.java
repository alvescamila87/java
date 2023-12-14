package aula48.aula47;

public class MultiCatchJava7 {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] divisor = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++) {

            try{
                System.out.println(numeros[i] + " / " + divisor[i] + " = " + (numeros[i] / divisor[i]));
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Aconteceu um erro!");
            } 

        }
    }
}
