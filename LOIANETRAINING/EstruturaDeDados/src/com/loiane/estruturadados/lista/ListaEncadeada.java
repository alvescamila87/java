package com.loiane.estruturadados.lista;

/**
 * ListaEncadeada
 */
public class ListaEncadeada<T>  {

    private No<T> inicio; // não deve ver nem get nem set (apenas interno)
    private No<T> ultimo;
    private int tamanho = 0; // apenas o get

    private final int NAO_ENCONTRADO = -1;

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

    public void adicionaNoInicio(T elemento) {
        if(this.tamanho == 0) {
            No<T> novoNo = new No<>(elemento);
            this.inicio = novoNo;
            this.ultimo = novoNo;
        } else {
            No<T> novoNo = new No<>(elemento, this.inicio);
            this.inicio = novoNo;
        }
        this.tamanho++;
    }

    public void adiciona(int posicao, T elemento) {

        if(posicao <  0 || posicao > this.tamanho) {
            throw new IllegalArgumentException("Posição inválida");
        }
        if(posicao == 0) { // lista vazia
            this.adicionaNoInicio(elemento);
        } else if(posicao == this.tamanho) { // adiciona na última posição
            this.adiciona(elemento);
        } else { // meio da lista
            No<T> noAnterior = this.buscaNo(posicao);
            No<T> proximoNo = noAnterior.getProximo(); //sempre o próximo primeiro, caso contrário perde referência
            No<T> novoNo = new No<>(elemento);
            novoNo.setProximo(proximoNo); //sempre o próximo primeiro, caso contrário perde referência
            noAnterior.setProximo(novoNo);
            this.tamanho++;
        }
    }

    public T removerDoInicio() {

        if(this.tamanho == 0) {
            throw new RuntimeException("Lista está vazia");
        }

        T removido = this.inicio.getElemento();
        this.inicio = this.inicio.getProximo();
        this.tamanho--;

        if(this.tamanho == 0) {
            this.ultimo = null;
        }

        return removido;

    }

    public T removerDoFinal() {
        if(this.tamanho == 0) {
            throw new RuntimeException("Lista está vazia");
        }
        if(this.tamanho == 1) {
            return this.removerDoInicio();
        }
        No<T> penultimoNo = this.buscaNo(this.tamanho - 2);
        T removido = penultimoNo.getProximo().getElemento();
        penultimoNo.setProximo(null);
        this.ultimo = penultimoNo;
        this.tamanho--;

        return removido;
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

    // para não expor o nó fora da classe (no busca por posição)
    private No<T> buscaNo(int posicao) {

        // se a posição NÃO existir:
        if(!(posicao >= 0 && posicao <= this.tamanho)) {
            throw new IllegalArgumentException("Posição não existe");
        }

        No<T> noAtual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            noAtual = noAtual.getProximo();
        }

        return noAtual;
    }
    public T buscaPorPosicao(int posicao) {
        return this.buscaNo(posicao).getElemento();
    }

    public int busca(T elemento) {

        No<T> noAtual = this.inicio;
        int posicao = 0;

        while (noAtual != null) {

            // comparar se é o elemento procurado
            if(noAtual.getElemento().equals(elemento)){
                return posicao;
            }
            posicao++; //posicao += 1; ou posicao = posicao + 1;


            // para mover o nó atual
            noAtual = noAtual.getProximo();
        }


        return NAO_ENCONTRADO;
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