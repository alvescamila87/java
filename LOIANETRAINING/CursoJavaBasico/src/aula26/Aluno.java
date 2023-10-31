package aula26;

public class Aluno {

    String nome;
    String idMatricula;
    String[] disciplinas;
    double[] notasDisciplinas;

    void consultarAprovacao() {
        for (int i = 0; i < disciplinas.length; i++) {
                if(notasDisciplinas[i] >= 7) {
                    System.out.println("Disciplina: " + disciplinas[i] + " -> Classificação: Aprovado");
                } else {
                    System.out.println("Disciplina: " +  disciplinas[i] + " -> Classificação: Em exame");
                }
        }
    }
}

