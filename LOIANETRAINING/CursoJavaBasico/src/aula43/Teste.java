package aula43;

public class Teste {
    // Hierarchy For Package java.lang
    // https://docs.oracle.com/javase/8/docs/api/java/lang/package-tree.html

    // Apache commons
    // https://commons.apache.org/proper/commons-lang/

    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setCurso("Ciência da Computação");;
        double[] notas = {10, 9 , 8, 7};
        aluno.setNotas(notas);
        System.out.println(aluno);

        // Exemplo 1
        String s1 = "asdjkandf";
        String s2 = "asdjkandF";

        System.out.println(s1 == s2); // false

        // Exemplo 2
        String s3 = "iouorierj";
        String s4 = "iouorierJ";

        System.out.println(s3.equals(s4)); // false (sensitive case)

        // Exemplo 3
        String s5 = "poepoqwjA";
        String s6 = "poepoqwja";

        System.out.println(s5.equalsIgnoreCase(s6)); // true (ignore sensitive case)

        // Exemplo 4
        String s7 = "oofhweifB";
        String s8 = "oofhweifB";

        System.out.println(s7.equals(s8)); // true

        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciência da Computação");;
        double[] notas2 = {8, 7, 9, 5};
        aluno2.setNotas(notas2);
        System.out.println("Aluno: " + aluno.equals(aluno2));

    }
}
