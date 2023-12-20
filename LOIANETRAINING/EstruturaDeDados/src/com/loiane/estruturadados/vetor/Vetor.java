package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    // adicionar elemento no final do vetor

    /* Não é uma boa prática: percorrer TODOS os elementos:

    public void adicionar(String elemento) {

        for (int i = 0; i < elementos.length; i++) {

            if(this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }

        }
    }
    */

    // É uma boa prática: guardar a última posição que inseriu um elemento

    /*
    public void adicionar(String elemento) throws Exception {

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
        }

    }
    */

    public boolean adicionar(String elemento) {

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // verificar tamanho do vetor (não deve ser set para o usuário)
    public int tamanho() {
        return this.tamanho;
    }

    // imprimir elementos do vetor, sem os elementos "nulos"
    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho -1; i++) {

            s.append(this.elementos[i]);
            s.append(", ");

        }

        if(this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

    // busca para obter o elemento de uma posição
    public String busca(int posicao) {

        // se negar a codição, temos o range de todas as posições que NÃO podem ser acessadas
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];


    }

    // verificar se o elemento existe no vetor
    public int busca(String elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                return i; //true
            }
        }
        return -1; //false
    }
}
