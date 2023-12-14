package exercicios.aula46.e03;

public class Circulo extends Figura2D {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return (raio * raio) * Math.PI;
        //return raio * raio * 3.14;
        //return Math.pow(raio, 2) * Math.PI;
    }
}
