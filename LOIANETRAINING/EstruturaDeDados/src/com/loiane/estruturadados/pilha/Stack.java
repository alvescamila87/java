package com.loiane.estruturadados.pilha;

public class Stack {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        java.util.Stack<Integer> stack = new java.util.Stack<>();

        //isEmpty - estaVazia
        System.out.println("Is empty: " + stack.isEmpty());

        //push item - empilhar item
        stack.push(2);
        stack.push(13);
        stack.push(20);

        //toString - print Pilha
        System.out.println(stack);

        //size - tamanho
        System.out.println("Size: " + stack.size());

        //peek stack - espiar topo da pilha
        System.out.println("Peek: " + stack.peek());

        //pop item - remover item
        stack.pop();

        System.out.println(stack);

    }
}
