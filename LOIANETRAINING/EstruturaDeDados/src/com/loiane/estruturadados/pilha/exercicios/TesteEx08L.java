package com.loiane.estruturadados.pilha.exercicios;

import java.util.Stack;

public class TesteEx08L {

    public static void main(String[] args) {

        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        original.push(3);
        original.push(2);
        original.push(1);

        torreDeHanoi(original.size(), original, destino, auxiliar);

    }

    public static void torreDeHanoi(int numeroDiscos, Stack<Integer> original,
                                    Stack<Integer> destino, Stack<Integer> auxiliar) {

        if(numeroDiscos > 0){
            torreDeHanoi(numeroDiscos-1, original, auxiliar, destino);
            destino.push(original.pop());
            System.out.println("-----------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreDeHanoi(numeroDiscos-1, auxiliar, destino, original);
        }

    }
}
