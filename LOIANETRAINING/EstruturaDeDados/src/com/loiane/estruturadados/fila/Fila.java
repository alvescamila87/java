package com.loiane.estruturadados.fila;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileira(T elemento) {

        //this.elementos[this.tamanho] = elemento;
        //tamanho++;

        //this.elementos[tamanho++] = elemento;

        super.adiciona(elemento);
    }

    public T deenfileira() {

        final int POSICAO = 0;

        if(this.estaVazia()) {
            return null;
        } // colocar essa validação para não apresentar erro/exception

        T elementoASerRemovido = this.elementos[0];

        this.remove(POSICAO);

        /*
        for (int i = POSICAO; i <= tamanho-1; i++) {
            elementos[i] = elementos[i + 1];
        }
        this.tamanho--
         */

        return elementoASerRemovido;

    }

    public T espiar() {

        if(this.estaVazia()) {
            return null;
        } // colocar essa validação para não apresentar erro/exception

        return this.elementos[0];
    }
}
