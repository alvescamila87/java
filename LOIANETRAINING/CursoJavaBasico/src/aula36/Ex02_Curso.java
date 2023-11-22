package aula36;

public class Ex02_Curso {
    private String nome;
    private String horario;
    private Ex02_Professor professor;
    private Ex02_Aluno[] alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Ex02_Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Ex02_Professor professor) {
        this.professor = professor;
    }

    public Ex02_Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Ex02_Aluno[] alunos) {
        this.alunos = alunos;
    }
}
