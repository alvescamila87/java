package aula26;

public class TesteLampada1 {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.ligar();
        System.out.println("A lâmpada está: "+ lampada.ligada);

        lampada.desligar();
        System.out.println("A lâmpada está: " + lampada.ligada);

    }
}
