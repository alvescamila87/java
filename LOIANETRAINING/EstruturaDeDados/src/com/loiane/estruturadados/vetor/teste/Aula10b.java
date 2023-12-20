package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10b {

    public static void main(String[] args) {

        VetorObjetos vetor = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "96325-8742", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "85214-4444", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "22300-3333", "contato3@gmail.com");
        Contato c4 = new Contato("Contato 1", "96325-8742", "contato1@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);

        System.out.println("Tamanho = " + vetor.tamanho());

        int pos = vetor.busca(c4); // Método equals na classe
        if(pos > -1) {
            System.out.println("Elemento existe no vetor!");
        } else {
            System.out.println("Elemento NÃO existe no vetor!");
        }

        System.out.println(vetor);

    }
}
