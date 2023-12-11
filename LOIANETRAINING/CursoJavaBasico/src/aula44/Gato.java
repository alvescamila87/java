package aula44;

public class Gato extends Mamifero implements AnimalEstimacao, AnimalDomestico{

    private String raca;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public void emitirSom() {

    }

    @Override
    public void amamentar() {

    }

    @Override
    public void alimentar() {

    }

    @Override
    public void levarVeterinario() {

    }

    @Override
    public void chamarVeterinario() {

    }

    @Override
    public void brincar() {

    }

    @Override
    public void levarPassear() {

    }
}
