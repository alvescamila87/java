package aula33;

public class Lampada {

    private String marca;
    private String[] tipos;
    private int potencia;
    private String cor;
    private boolean ligada;

    public Lampada() {

    }

    public Lampada(String marca, String[] tipos, int potencia, String cor, boolean ligada) {
        this.marca = marca;
        this.tipos = tipos;
        this.potencia = potencia;
        this.cor = cor;
        this.ligada = ligada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String[] getTipos() {
        return tipos;
    }

    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void mostrarEstado() {
        if(isLigada()) {
            System.out.println("Lâmpada ligada");
        } else {
            System.out.println("Lâmpada desligada");
        }
    }

    public void mudarEstado() {
        if (isLigada()) {
            desligar();
        } else {
            ligar();
        }
    }
}
