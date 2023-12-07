package aula39;

public class Teste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        Professor professor = new Professor();

        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Camila");

        professor.setNome("Maria");

        aluno.setNome("Princesa Isabel");

        // Pode ser feito dessa forma

        Pessoa aluno1 = new Aluno();

        aluno1.setNome("João");


    }
}
