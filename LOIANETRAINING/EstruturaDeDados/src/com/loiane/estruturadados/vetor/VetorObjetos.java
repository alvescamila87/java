package com.loiane.estruturadados.vetor;

public class VetorObjetos {

    private Object[] elementos;
    private int tamanho;

    public VetorObjetos(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(Object elemento) {
        aumentaCapacidade();

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    // Overloading do método adiciona
    // adicionar elemento em qualquer posição
    // 0 1 2 3 4 5 6 -> tamanho é 5
    // B C E F G + + (adicionar o A na posição 0)
    public void adiciona(int posicao, Object elemento) {

        if(!(posicao >= 0 && posicao < tamanho)) {
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

    // aumenta capacidade do vetor
    private void aumentaCapacidade() {

        if(this.tamanho == this.elementos.length) {
            Object[] elementosNovos = new Object[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
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
    public Object busca(int posicao) {

        // se negar a codição, temos o range de todas as posições que NÃO podem ser acessadas
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];

    }

    // verificar se o elemento existe no vetor
    public int busca(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if(this.elementos[i].equals(elemento)) {
                return i; //true
            }
        }
        return -1; //false
    }

    // remover elemento em qualquer posição
    // B G D E F -> posição a ser removida é 1 (G)
    // 0 1 2 3 4 -> tamanho é 5
    // vetor[1] = vetor[2]
    // vetor[2] = vetor[3]
    // vetor[3] = vetor[4]
    public void remove(int posicao) {

        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!");
        }

        //mover todos os elementos
        for (int i = posicao; i <= this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;

    }
}
