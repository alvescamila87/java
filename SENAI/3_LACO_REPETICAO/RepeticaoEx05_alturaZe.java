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
        System.out.println("Quantos anos: " + contador);
        System.out.println("Chico: " + ze);
        System.out.println("Zé: "+ ze);

    }
}
