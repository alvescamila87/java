public class RepeticaoEx05_alturaZe {
    public static void main(String[] args) {

        double chico = 1.50;
        double ze = 1.10;
        int contador = 1;

        while (ze <= chico) {
            contador++;
            chico = chico + 0.02;
            ze = ze + 0.03;
        }
        System.out.printf("Serão necessários %s anos para que Zé seja maior que Chico. \n", contador);
        System.out.printf("Chico: %.2f cm \n", chico);
        System.out.printf("Zé: %.2f cm \n", ze);

    }
}
