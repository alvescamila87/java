package aula32;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();

        // Chamando setters encapsulados
        van.setMarca("VW");
        van.setModelo("Polo");
        van.setNumeroPassageiros(4);
        van.setTamanhoTanque(45);
        van.setConsumoTanque(12);

        // Chamando getters encapsulados e imprimindo
        System.out.println(van.getMarca() + " " + van.getModelo() + " "
                + van.getNumeroPassageiros() + " " + van.getTamanhoTanque() + " "
                + van.getConsumoTanque());

    }
}
