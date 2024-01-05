package com.loiane.estruturadados.pilha.exercicios;

public class Carro {

    private String modelo;
    private String marca;
    private int ano;
    private String cor;

    public Carro() {
        super();
    }

    public Carro(String modelo, String marca, int ano, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Carro {" +
                "modelo= '" + modelo + '\'' +
                ", marca= '" + marca + '\'' +
                ", ano=" + ano +
                ", cor= '" + cor + '\'' +
                "} ";
    }
}
