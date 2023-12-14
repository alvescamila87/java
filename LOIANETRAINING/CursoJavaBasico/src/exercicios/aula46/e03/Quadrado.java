package exercicios.aula46.e03;

public class Quadrado extends Figura2D {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
        //return Math.pow(lado, 2);
    }
}
