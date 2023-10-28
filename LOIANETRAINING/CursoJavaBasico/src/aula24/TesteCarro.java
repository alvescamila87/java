package aula24;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "VW";
        van.modelo = "Fusca";
        van.tamanhoTanque = 30;
        van.consumoCombustivel = 10;
        van.numeroPassageiros = 4;

        System.out.println("Marca: " + van.marca);
        System.out.println("Modelo: " + van.modelo);
        System.out.println("Tamanho do tanque: " + van.tamanhoTanque);
        System.out.println("Consumo por km rodado: " + van.consumoCombustivel);
        System.out.println("Qtd passageiros: " + van.numeroPassageiros);
    }
}
