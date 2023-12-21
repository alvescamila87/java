package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12ArrayList {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList();

        // adiciona elemento no array
        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        // adiciona elemento no array através de índice
        arrayList.add(1, "B");

        System.out.println(arrayList);

        // busca o elemento se possui no array
        boolean existe = arrayList.contains("A");

        if(existe) {
            System.out.println("Existe no arraylist");
        } else {
            System.out.println("Não existe no arraylist");
        }

        // busca o elemento e retorna o índice
        int pos = arrayList.indexOf("D");
        if(pos > -1){
            System.out.println("Existe no arraylist na posição: " + pos);
        } else {
            System.out.println("Não existe no arraylist " + pos
            );
        }

        // busca por posição
        System.out.println(arrayList.get(2));

        // remove passando índice
        arrayList.remove(0);
        arrayList.remove("B"); // remove passando objeto

        System.out.println(arrayList);

        // tamanho
        System.out.println(arrayList.size());

    }
}
