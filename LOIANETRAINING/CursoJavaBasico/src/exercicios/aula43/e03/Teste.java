package exercicios.aula43.e03;

public class Teste {

    public static void main(String[] args) {

        System.out.println("ZOO");

        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setComprimento(150);
        //camelo.setNumeroPatas(4);
        camelo.setCor("Amarelo");
        camelo.setAmbiente("Terra");
        camelo.setVelocidade(2);

        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("-----------------------------");

        for (Animal animal : animais) {
            System.out.println(animal);
            System.out.println();
            System.out.println("-----------------------------");
        }
    }

}
