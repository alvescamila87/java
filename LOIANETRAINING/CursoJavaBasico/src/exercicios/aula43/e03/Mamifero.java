package exercicios.aula43.e03;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero() {
        super();
        this.setCor("Marrom");
        this.setAmbiente("Terra");
        this.alimento = "Mel";
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n alimento='" + alimento + '\'' +
                "} ";
    }
}
