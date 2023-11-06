package aula33;

public class TesteLampada {
    public static void main(String[] args) {


        Lampada lamp = new Lampada();

        lamp.ligar();
        lamp.mostrarEstado();

        lamp.desligar();
        lamp.mostrarEstado();

        lamp.mudarEstado();
        lamp.mostrarEstado();

    }
}
