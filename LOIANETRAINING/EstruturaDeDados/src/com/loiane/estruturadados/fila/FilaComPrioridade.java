package com.loiane.estruturadados.fila;

public class FilaComPrioridade<T> extends Fila<T> {


    @Override
    public void enfileira(T elemento) {

        /*
        for (int i = 0; i < this.elementos.length; i++) {

            if(elemento > this.elementos[i]) { // não é possível usar o ">" para comparação
                this.adiciona(i, elemento);
                break;
            }
        }
        */

        //casting
        Comparable<T> chave = (Comparable<T>) elemento;

        int i;
        for (i = 0; i < this.tamanho; i++) {
            if(chave.compareTo(this.elementos[i]) < 0){
                break;
            }
        }
        this.adiciona(i, elemento); //pode ser chave no lugar de elemento
    }


}
