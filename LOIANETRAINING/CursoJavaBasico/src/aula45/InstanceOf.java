package aula45;

import java.util.prefs.PreferencesFactory;

public class InstanceOf {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();

        // Instance Of:

        if(pessoa instanceof Pessoa) {
            System.out.println("O objeto é do tipo de classe Pessoa.");
        }

        if(aluno instanceof Aluno) {
            System.out.println("O objeto é do tipo de classe Aluno.");
        }

        if(prof instanceof Professor) {
            System.out.println("O objeto é do tipo de classe Professor.");
        }


    }
}
