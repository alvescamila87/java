package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

public class TesteEx04 {

    public static void main(String[] args) {

        Stack<Carro> listaCarros = new Stack<>();

        Carro carro1 = new Carro();
        carro1.setMarca("VW");
        carro1.setModelo("Polo");
        carro1.setAno(2024);
        carro1.setCor("Preto");

        Carro carro2 = new Carro();
        carro2.setMarca("BMW");
        carro2.setModelo("X5");
        carro2.setAno(2023);
        carro2.setCor("Branco");

        Carro carro3 = new Carro();
        carro3.setMarca("VW");
        carro3.setModelo("Jetta");
        carro3.setAno(2022);
        carro3.setCor("Grafite");

        Carro carro4 = new Carro();
        carro4.setMarca("VW");
        carro4.setModelo("Fusca");
        carro4.setAno(1969);
        carro4.setCor("Branco");

        System.out.println("Empilhando veículos!");

        listaCarros.push(carro1);
        listaCarros.push(carro2);
        listaCarros.push(carro3);
        listaCarros.push(carro4);

        System.out.println("Pilha está vazia? " + listaCarros.isEmpty());

        System.out.println("Topo da pilha: " + listaCarros.peek());

        System.out.println(listaCarros.size() + " tamanho da pilha de veículos criada.");

        System.out.println(listaCarros);

        System.out.println("Desempilhando veículos!");

        while (!listaCarros.isEmpty()) {
            listaCarros.pop();
        }

        System.out.println("Pilha está vazia? " + listaCarros.isEmpty());




    }
}
