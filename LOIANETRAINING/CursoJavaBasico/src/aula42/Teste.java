package aula42;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        // como não tem mais extends de herança:
        //Pessoa aluno = new Aluno();
        //Pessoa professor = new Professor();

        // e final como pessoa, precisa ser instanciado dessa forma:
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        //Sem FINAL
        System.out.println(Constantes.CURSO_COMPLETO);
        Constantes.CURSO_COMPLETO = "www.google.com";
        System.out.println(Constantes.CURSO_COMPLETO);

        //Com FINAL
        //System.out.println(Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "www.brasil.com.br";
    }
}
