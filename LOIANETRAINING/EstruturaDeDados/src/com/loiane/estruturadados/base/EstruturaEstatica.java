package com.loiane.estruturadados.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[])new Object[capacidade]; // solução melhor, é uma solução do livro effective Java
        this.tamanho = 0;
    }

    public EstruturaEstatica() {
        this(10);
    }

    // verificar se estrutura está vazia
    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    protected boolean adiciona(T elemento) {
        aumentaCapacidade();

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected void adiciona(int posicao, T elemento) {

        if(!(posicao >= 0 && posicao < tamanho))
        //if(!(posicao < 0 || posicao > tamanho)) { // aula 24
            throw new IllegalArgumentException("Posição inválida!");
        }

        aumentaCapacidade();

        //mover todos os elementos
        for (int i = this.tamanho-1; i >= posicao; i--) {
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    protected void remove(int posicao) {

        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        for (int i = posicao; i <= tamanho-1; i++) {
            elementos[i] = elementos[i + 1];
        }
        this.tamanho--;
    }

    private void aumentaCapacidade() {

        if(this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2]; // casting com classe T

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

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

}
