package exercicios.aula46.e02;

public class Cubo extends Figura3D {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 6 * (lado * lado);
        //return Math.pow(lado, 2) * 6
    }

    @Override
    public double calcularVolume() {
        // aresta = lado
        return lado * lado * lado;
        //return Math.pow(lado, 3);
    }
}
