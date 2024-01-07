package com.loiane.estruturadados.lista;

/**
 * ListaEncadeada
 */
public class ListaEncadeada<T>  {

    private No<T> inicio; // não deve ver nem get nem set (apenas interno)
    private No<T> ultimo;
    private int tamanho = 0; // apenas o get

    public void adiciona(T elemento) {
        No<T> celula = new No<T>(elemento);

        if(this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }        
        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void limpa() {

        // maneira mais correta:
        for (No<T> atual = this.inicio; atual != null;) {
            No<T> proximo = atual.getProximo();
            atual.setElemento(null);
            atual.setProximo(null);
            atual = proximo;
        }

        // maneira mais simples
        this.inicio = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        // [1, 2, 3, 4]        

        if(this.tamanho == 0) {
            return "[]";
        } 

        StringBuilder builder = new StringBuilder("[");
        //return "ListaEncadeada [inicio=" + inicio + "]";

        No<T> atual = this.inicio; // posição 0 é o início
        // Forma mais elegante
        for (int i = 0; i < this.tamanho - 1; i++) {
             builder.append(atual.getElemento()).append(", ");
             atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        /* // Forma Clássica
        builder.append(atual.getElemento()).append(",");
        while (atual.getProximo() != null) {
            atual = atual.getProximo();
            builder.append(atual.getElemento()).append(",");
        }
        */

        return builder.toString();

    }

    
}