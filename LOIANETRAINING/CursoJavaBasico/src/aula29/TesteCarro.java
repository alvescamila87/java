package aula29;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        System.out.println("Número passageiros: " + van.numeroPassageiros);

        Carro van2 = new Carro("VW");
        System.out.println("Marca: " + van2.marca);


    }

}
