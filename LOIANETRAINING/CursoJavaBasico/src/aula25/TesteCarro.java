package aula25;

public class TesteCarro {

    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.marca = "VW";
        carro1.modelo = "Fusca";
        carro1.capacidadeTanque = 43;
        carro1.consumoKmRodado = 9.5;

        // declarar método simples
        carro1.exibirAutonomia();

        // declarar método com retorno 1 - Exemplo 1
        carro1.obterAutonomia();

        // declarar método com retorno 1 - Exemplo 2
        System.out.println("Exemplo 2: A autonomia do carro é: " + carro1.obterAutonomia());

        // declarar método com retorno 1 - Exemplo 3
        double autonomia = carro1.obterAutonomia();
        System.out.println("Exemplo 3: A autonomia do carro é: " + autonomia);

        // declarar método com parâmetro - Exemplo 1
        double qtdCombustivel10 = carro1.calcularCombustivel(10);
        double qtdCombustivel15 = carro1.calcularCombustivel(15);

        System.out.println("Qtd combustível 10km: " + qtdCombustivel10);
        System.out.println("Qtd combustível 15km: " + qtdCombustivel15);

        // declarar método com parâmetro - Exemplo 2
        carro1.calcularCombustivel(15);
        System.out.println("Gasolina para rodar 15km: " + carro1.calcularCombustivel(15));

    }
}
