package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Aula24 {
    public static void main(String[] args) {

        // para testar essa aula, precisa comentar a exceção do
        // método adiciona(posição, elemento) da classe Estrutura Estática

        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileira(1);
        fila.enfileira(3);
        fila.enfileira(2);

        System.out.println(fila); // fila ordenada com a prioridade 1,2 e 3. Não mais sendo 1,3 e 2.

        // alteração de Integer para Paciente

        FilaComPrioridade<Paciente> filaPaciente = new FilaComPrioridade<>();

        filaPaciente.enfileira(new Paciente("A", 2));
        filaPaciente.enfileira(new Paciente("C", 1));
        filaPaciente.enfileira(new Paciente("B", 3));

        System.out.println(filaPaciente);

        // desenfileirar
        System.out.println(filaPaciente.deenfileira());

        System.out.println(filaPaciente);

    }
}
