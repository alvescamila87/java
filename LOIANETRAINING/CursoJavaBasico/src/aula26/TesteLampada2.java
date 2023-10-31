package aula26;

import java.sql.SQLOutput;

public class TesteLampada2 {

    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        System.out.println("Ligar lâmpada");
        lampada.ligar();
        lampada.mudarEstado();
        System.out.println("Status: " + lampada.ligada);

        System.out.println("Desligar lâmpada");
        lampada.desligar();
        lampada.mudarEstado();
        System.out.println("Status: " + lampada.ligada);

    }
}
