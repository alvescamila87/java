package exercicios.aula43.e03;

public class Peixe extends Animal {

    private String caracteristicas;

    public Peixe() {
        super();
        this.setNumeroPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzeta");
        this.caracteristicas = "barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n caracteristicas='"
                + caracteristicas + '\'' + "} ";
    }
}
