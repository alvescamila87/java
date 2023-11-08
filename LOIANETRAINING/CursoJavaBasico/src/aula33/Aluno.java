package aula33;

public class Aluno {

    private String nome;
    private String idMatricula;
    private String[] disciplinas;
    private double[][] notasDisciplinas;

    public Aluno() {
        disciplinas = new String[3];
        notasDisciplinas = new double[3][4];

    }
    public Aluno(String nome, String idMatricula, String[] disciplinas, double[][] notasDisciplinas) {
        this.nome = nome;
        this.idMatricula = idMatricula;
        this.disciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }
}
