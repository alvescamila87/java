package aula48;

public class MultiCatchGenerico {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] divisor = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++) {

            try{
                System.out.println(numeros[i] + " / " + divisor[i] + " = " + (numeros[i] / divisor[i]));
            } catch (ArithmeticException e) {
                System.out.println("Não é possível fazer divisão por ZERO.");
            } catch (Throwable e) {
                System.out.println("Erro genérico: Ocorreu um erro.");
            }

        }
    }
}
