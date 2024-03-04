public class CalculadoraCortisol {
    public static void main(String[] args) {

        double cortisol = 18.2;

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        boolean resultadorAnormal = !resultadoNormal;

        System.out.println("Cortisol normal: " + resultadoNormal);
        System.out.println("Cortisol anormal: " + resultadorAnormal);

        if(resultadoNormal) {
            System.out.println("Cortisol normal");
        }

    }
}
