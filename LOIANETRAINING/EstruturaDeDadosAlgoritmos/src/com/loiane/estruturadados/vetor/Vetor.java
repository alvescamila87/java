package com.loiane.estruturadados.vetor;

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
    public void adicionar(String elemento) throws Exception {

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        } else {
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos.");
        }

    }


}
