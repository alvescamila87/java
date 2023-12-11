package exercicios.aula43.e03;

// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43

public class Animal {

    private String nome;
    private double comprimento;
    private int numeroPatas;
    private String cor;
    private String ambiente;
    private double velocidade;

    public Animal() {
        this.numeroPatas = 4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "\n nome='" + nome + '\'' +
                ",\n comprimento=" + comprimento + " cm" +
                ",\n numeroPatas=" + numeroPatas +
                ",\n cor='" + cor + '\'' +
                ",\n ambiente='" + ambiente + '\'' +
                ",\n velocidade=" + velocidade + " m/s" +
                '}';
    }
}
