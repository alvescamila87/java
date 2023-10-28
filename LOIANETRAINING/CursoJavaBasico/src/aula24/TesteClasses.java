package aula24;

import java.sql.SQLOutput;

public class TesteClasses {

    public static void main(String[] args) {

        // lampada
        Lampada lampadaPadrao = new Lampada();
        lampadaPadrao.cor = "Branca";
        lampadaPadrao.marca = "Philips";
        lampadaPadrao.potencia = 30;
        lampadaPadrao.tipoLuz = "LED";

        System.out.println("Marca: " + lampadaPadrao.marca);
        System.out.println("Cor: " + lampadaPadrao.cor);
        System.out.println("Potência: " + lampadaPadrao.potencia + "watts");
        System.out.println("Tipo de luz: " + lampadaPadrao.tipoLuz);

    }
    

}
