package com.loiane.estruturadados.pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }

    public Pilha(int capacidade) {
        super(capacidade);
    }

    // empilhar elemento

    public void empilhar(T elemento) {
       /*  this.aumentaCapacidade();

        this.elementos[tamanho++] = elemento;
        //tamanho++;

        */

        super.adiciona(elemento); //reuso de código da EstruturaEstática
    }

    // check peek stack
    public T topo() {
        if(this.estaVazia()) {
            return null;
        } else {
            return this.elementos[tamanho - 1];
        }
    }

    public T desempilha() {

        if(this.estaVazia()) {
            return null;
        }

        /* T elemento = this.elementos[tamanho - 1];
        tamanho--;

        return elemento; */

        return this.elementos[--tamanho]; // 1º diminui -1, depois faz o tamanho--;

    }

}
