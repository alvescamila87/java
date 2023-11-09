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

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + idMatricula);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Notas da disciplina " + disciplinas[i]);

            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.print(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice) {

        if (obterMedia(indice) >= 7) {
            return true;
        }

        return false;

    }

    private double obterMedia(int indice) {
        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {

            soma += notasDisciplinas[indice][i];

        }

        double media = soma / 4;

        return media;
    }

    public void setNomeDisciplinaPosicao(int posicao, String nomeDisciplina) {
        this.disciplinas[posicao] = nomeDisciplina;
    }

    public void setNotaDisciplinaPosicaoIJ(int posicaoI, int posicaoJ, double notaDisciplina) {
        this.notasDisciplinas[posicaoI][posicaoJ] = notaDisciplina;
    }
}
