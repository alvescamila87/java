package aula49;

public class FinallyPegadinha {

    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] divisor = {2, 0, 4, 8, 0};

        for(int i = 0; i < numeros.length; i++) {

            try{
                System.out.println(numeros[i] + " / " + divisor[i] + " = " + (numeros[i] / divisor[i]));
            } catch (ArithmeticException e1) {
                System.out.println("Não é possível fazer divisão por ZERO.");
                System.exit(0); // finally NÃO é executado
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Posição do array inválida.");
                System.exit(0); // finally NÃO é executado
            }
            finally {
                System.out.println("Essa linha é impressa sempre após o try ou catch.");
                System.out.println();
            }

        }
    }

}
