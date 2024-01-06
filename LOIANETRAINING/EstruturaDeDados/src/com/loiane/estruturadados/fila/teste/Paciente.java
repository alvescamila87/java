package com.loiane.estruturadados.fila.teste;

public class Paciente implements Comparable<Paciente> {
    private String nome;

    private int prioridade;

    public Paciente(){

    }

    public Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "Paciente {" +
                "nome='" + nome + '\'' +
                ", prioridade=" + prioridade +
                '}';
    }


    @Override
    public int compareTo(Paciente o) {

        // obj 1 > obj 2 -> retorna > 0 -> (1)
        // obj 1 < obj 2 -> retorna < 0 -> (-1)
        // obj 1 == obj 2 -> retorna == 0

        if(this.prioridade > o.getPrioridade()){
            // se a prioridade do paciente 1 for maior que o paciente 2
            return 1;
        } else if(this.prioridade < o.getPrioridade()) {
            // se a prioridade do paciente 1 for menor que o paciente 2
            return -1;
        }

        return 0;
    }
}
