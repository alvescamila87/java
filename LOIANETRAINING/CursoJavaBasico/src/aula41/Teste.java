package aula41;

public class Teste {
    public static void main(String[] args) {

        //Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        //pessoa.setEndereco("Rua 1, Nº: 01");
        aluno.setEndereco("Rua 2, Nº: 02");
        professor.setEndereco("Rua 3, Nº: 03");

        //System.out.println("Pessoa: " + pessoa.obterEtiquetaEndereco());
        //System.out.println(aluno.obterEtiquetaEndereco());
        //System.out.println(professor.obterEtiquetaEndereco());

        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();

    }
}
