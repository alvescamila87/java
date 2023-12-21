package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;

public class Aula11c {

    public static void main(String[] args) {

        Lista<Contato> vetor = new Lista(1);

        Contato c1 = new Contato("Contato 1", "96325-8742", "contato1@gmail.com");
        Contato c2 = new Contato("Contato 2", "85214-4444", "contato2@gmail.com");
        Contato c3 = new Contato("Contato 3", "22300-3333", "contato3@gmail.com");

        vetor.adiciona(c1);
        vetor.adiciona(c2);
        vetor.adiciona(c3);



    }
}
