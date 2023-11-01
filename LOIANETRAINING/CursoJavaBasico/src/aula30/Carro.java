package aula30;

// this

public class Carro {

    String marca;
    String modelo;
    int numeroPassageiros;
    double capacidadeTanque;
    double consumoKmRodado;

    public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeTanque, double consumoKmRodado) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.consumoKmRodado = consumoKmRodado;
    }

    public Carro() {
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
        System.out.println("Chamando construtor com 2 parâmetros");
    }

    public Carro(String marca, String modelo, int numeroPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPassageiros = numeroPassageiros;
        System.out.println("Chamando construtor com 3 parâmetros");
    }

    // métodos (funções)

    // método simples, sem retorno e parâmetro
    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " + this.capacidadeTanque * this.consumoKmRodado + " km.");
    }

    // método com retorno

    double obterAutonomia() {

        System.out.println("Método obterAutonomia foi chamado.");
        return this.capacidadeTanque * this.consumoKmRodado;
    }

    // método com parâmetro

    double calcularCombustivel(double km) {

        double qtdCombustivel = km/this.consumoKmRodado;

        return qtdCombustivel;
    }
}