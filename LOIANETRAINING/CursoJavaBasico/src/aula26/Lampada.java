package aula26;

public class Lampada {
    String marca;
    String[] tipos;
    int potencia;
    String cor;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mudarEstado() {
        if(ligada) {
            desligar();
        } else {
            ligar();
        }
    }

    void mostrarEstado(){
        if(ligada) {
            System.out.println("Ligada");
        } else {
            System.out.println("Desligada");
        }
    }

}
