package aula32;

// encapsulamento

public class Carro {

    private String marca;
    private String modelo;
    private int numeroPassageiros;
    private double tamanhoTanque;
    private double consumoTanque;

    //Getters

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getNumeroPassageiros() {
        return this.numeroPassageiros;
    }

    public double getTamanhoTanque() {
        return this.tamanhoTanque;
    }

    public double getConsumoTanque() {
        return this.consumoTanque;
    }

    //Setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public void setTamanhoTanque(double tamanhoTanque) {
        this.tamanhoTanque = tamanhoTanque;
    }

    public void setConsumoTanque(double consumoTanque) {
        this.consumoTanque = consumoTanque;
    }


}
