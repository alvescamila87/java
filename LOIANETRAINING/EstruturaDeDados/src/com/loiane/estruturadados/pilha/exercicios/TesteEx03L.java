package com.loiane.estruturadados.pilha.exercicios;

import com.loiane.estruturadados.pilha.Pilha;



public class TesteEx03L {

    public static void main(String[] args) {

        Pilha<Livro> pilhaLivros = new Pilha<>(20);

        Livro livro1 = new Livro();
        livro1.setTitulo("Biblia");
        livro1.setAutor("Deus");
        livro1.setIsbn("SDAF651F6S");
        livro1.setAnoLancamento(33);

        Livro livro2 = new Livro();
        livro2.setTitulo("LeaRning Java");
        livro2.setAutor("Loiane Groner");
        livro2.setIsbn("F65F16F5E1F");
        livro2.setAnoLancamento(2016);

        Livro livro3 = new Livro();
        livro3.setTitulo("Mastering Ext JS");
        livro3.setAutor("Loiane Groner");
        livro3.setIsbn("GW4189G8W");
        livro3.setAnoLancamento(2015);

        Livro livro4 = new Livro();
        livro4.setTitulo("JS Regular Expressions");
        livro4.setAutor("Loiane Groner");
        livro4.setIsbn("G8519WRG1W");
        livro4.setAnoLancamento(2015);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilhaLivros.estaVazia());

        System.out.println("Empilhando livros na pilha:");

        pilhaLivros.empilhar(livro1);
        pilhaLivros.empilhar(livro2);
        pilhaLivros.empilhar(livro3);
        pilhaLivros.empilhar(livro4);

        System.out.println(pilhaLivros.tamanho() + " livros estão sendo empilhados: ");
        System.out.println(pilhaLivros);

        System.out.println("Pilha de livros criada, pilha está vazia? " + pilhaLivros.estaVazia());

        System.out.println("Espiando o topo da pilha: " + pilhaLivros.topo());

        System.out.println("Desempilhando livros na pilha:");

        while (!pilhaLivros.estaVazia()) {
            pilhaLivros.desempilha();
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilhaLivros.estaVazia());




    }
}
