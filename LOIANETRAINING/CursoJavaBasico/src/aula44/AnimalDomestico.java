package aula44;

//public abstract classe foi substituido por 'interface'

public interface AnimalDomestico {

    // atributos só podem ser constantes
    public final int ANO = 2016;

    //public abstract é pleonasmo, basta void:

    void alimentar();
    void levarVeterinario();
    void chamarVeterinario();
}
