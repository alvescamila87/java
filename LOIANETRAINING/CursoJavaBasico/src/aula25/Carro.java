package aula25;

public class Carro {

    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeTanque;
    double consumoKmRodado;

    // métodos (funções)

    // método simples, sem retorno e parâmetro
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + capacidadeTanque * consumoKmRodado + " km.");
    }

    // método com retorno

    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");
        return capacidadeTanque * consumoKmRodado;
    }

    // método com parâmetro

    double calcularCombustivel(double km) {

        double qtdCombustivel = km/consumoKmRodado;

        return qtdCombustivel;
    }
}
