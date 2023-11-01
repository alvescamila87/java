package aula29;

// construtores e código de inicialização
public class Carro {

    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeTanque;
    double consumoKmRodado;

    Carro() {
        System.out.println("Classe carro foi instanciada");
        numeroPassageiros = 4;
    }

    Carro(String marca_) {
        marca = marca_;
    }

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