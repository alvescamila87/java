import java.util.Scanner;

public class RepeticaoEx09_relatorioPessoas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        int idade = 0;
        float altura = 0;
        float peso = 0;
        int contador50 = 0;
        float somaAltura = 0;
        int contador40 = 0;
        int contadorIdade1020 = 0;

        while (contador <= 6) {
            System.out.printf("Informe a idade da %sª pessoa: \n", contador);
            idade = entrada.nextInt();

            System.out.printf("Informe a altura da %sª pessoa: \n", contador);
            altura = entrada.nextFloat();

            System.out.printf("Informe o peso (kg) da %sª pessoa: \n", contador);
            peso = entrada.nextFloat();

            // a) a quantidade de pessoas com idade superior a 50 anos;

            if (idade > 50) {
                contador50++;
            }

            // b) a média das alturas das pessoas com idade entre 10 e 20 anos;

            if (idade >= 10 && idade <= 20) {
                contadorIdade1020++;
                somaAltura = somaAltura + altura;
            }

            // c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.

            if (peso < 40) {
                contador40++;
            }

            contador++;

        }
        System.out.printf("Quantidade de pessoas com idade superior a 50 anos: %s pessoas. \n", contador50);
        System.out.printf("Média de altura das pessoas com idade entre 10 e 20 anos: %.2f cm. \n", somaAltura / contadorIdade1020);
        System.out.printf("Porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas é de: %s por cento. \n", (contador40 * 100) / (contador - 1) );
    }
}
