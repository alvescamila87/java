package exercicios.aula46.e03;

public class Piramide extends Figura3D {

    private double altura;
    private double areaBase;
    private double apotema;
    private Figura2D base;
    private int numeroPoligonosBase;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public Figura2D getBase() {
        return base;
    }

    public void setBase(Figura2D base) {
        this.base = base;
    }

    public int getNumeroPoligonosBase() {
        return numeroPoligonosBase;
    }

    public void setNumeroPoligonosBase(int numeroPoligonosBase) {
        this.numeroPoligonosBase = numeroPoligonosBase;
    }

    @Override
    public double calcularArea() {
        if(base != null) {
            return (numeroPoligonosBase * ((areaBase * apotema) / 2)) + base.calcularArea();
        } else {
            return 0;
        }
    }

    @Override
    public double calcularVolume() {
        if(base != null) {
            return (base.calcularArea() * altura) / 3;
        } else {
            return 0;
        }

    }
}
