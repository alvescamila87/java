import java.util.Scanner;

public class Exe03_valorDesconto {
    public static void main(String[] args) {
        /*
         * Estrutura condicional Switch
         * Elabore um algoritmo que tendo como entrada o preço e código de origem de um produto, calcule e mostre na tela o valor do desconto concedido. Os códigos são os seguintes:
         * 1 - região norte com desconto de 5%,
         * 2 - região sul com desconto de 15%,
         * 3 - região sudeste com desconto de 7%,
         * 4 - região nordeste com desconto de 12% e
         * 5 - região centro-oeste com desconto de 20%.
         * Caso não seja informado nenhum código válido informar na tela que o produto é importado.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o preço do produto R$: ");
        double preco = entrada.nextDouble();

        System.out.println("Informe o código de origem do produto: ");
        int codigo = entrada.nextInt();

        double desconto = 0;
        double novoPreco = 0;

        switch (codigo) {
            case 1:
                desconto = preco * ((double) 5 / 100);
                novoPreco = preco - desconto;
                System.out.println("A região norte com desconto de 5%.");
                System.out.printf("Preço anterior R$%.2f.\n", preco);
                System.out.printf("Desconto R$%.2f.\n", desconto);
                System.out.printf("Preço final R$%.2f.\n", novoPreco);
            break;
            case 2:
                desconto = preco * ((double) 15 / 100);
                novoPreco = preco - desconto;
                System.out.println("A região sul com desconto de 15%.");
                System.out.printf("Preço anterior R$%.2f.\n", preco);
                System.out.printf("Desconto R$%.2f.\n", desconto);
                System.out.printf("Preço final R$%.2f.\n", novoPreco);
            break;
            case 3:
                desconto = preco * ((double) 7 / 100);
                novoPreco = preco - desconto;
                System.out.println("A região sudeste com desconto de 7%.");
                System.out.printf("Preço anterior R$%.2f.\n", preco);
                System.out.printf("Desconto R$%.2f.\n", desconto);
                System.out.printf("Preço final R$%.2f.\n", novoPreco);
            break;
            case 4:
                desconto = preco * ((double) 12 / 100);
                novoPreco = preco - desconto;
                System.out.println("A região nordeste com desconto de 12%.");
                System.out.printf("Preço anterior R$%.2f.\n", preco);
                System.out.printf("Desconto R$%.2f.\n", desconto);
                System.out.printf("Preço final R$%.2f.\n", novoPreco);
            break;
            case 5:
                desconto = preco * ((double) 20 / 100);
                novoPreco = preco - desconto;
                System.out.println("A região centro-oeste com desconto de 20%.");
                System.out.printf("Preço anterior R$%.2f.\n", preco);
                System.out.printf("Desconto R$%.2f.\n", desconto);
                System.out.printf("Preço final R$%.2f.\n", novoPreco);
            break;
            default: System.out.println("ERRO: Código inválido. Código de produto de importado.");
        }
        entrada.close();
    }
}
