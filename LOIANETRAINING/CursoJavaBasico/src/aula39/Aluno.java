package aula39;

public class Aluno extends Pessoa {


    private String curso;
    private double[] notas;

    public void verificarAcesso() {
        //super.nome = "Maria";

        super.nomeVisivel = "Maria";
        this.nomeVisivel = "Maria";
    }

    public Aluno() {
        super();
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovacao() {
        return true;
    }

    public void metodoQualquer() {
        super.setCpf("333.333.222-99");

        this.setCpf("333.333.222-99");
    }
}
