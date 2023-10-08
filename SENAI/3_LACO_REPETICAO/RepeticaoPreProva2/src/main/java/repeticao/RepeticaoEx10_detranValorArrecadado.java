package repeticao;

import java.util.Scanner;

public class RepeticaoEx10_detranValorArrecadado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int codigo = 0;
        float valorMulta = 189.90f;
        int qtdMultas = 0;
        int somaQtdMultas = 0;
        float total = 0;
        int maiorInfrator = 0;
        int maiorInfratorCodigo = 0;

        for (int i = 1; i <= 3; i++) {

            System.out.printf("Informe o código da carteira do %sº motorista: ", i);
            codigo = entrada.nextInt();

            System.out.printf("Informe a quantidade de multas do %sº motorista: ", i);
            qtdMultas = entrada.nextInt();

            if (qtdMultas > maiorInfrator) {
                maiorInfrator = qtdMultas;
                maiorInfratorCodigo = codigo;
            }

            somaQtdMultas = somaQtdMultas + qtdMultas;

        }

        //o total de recursos arrecadados
        total = somaQtdMultas * valorMulta;
        System.out.printf("Total arrecadado com multas R$%.2f. \n", total);
        System.out.printf("Código do maior infrator %s, com %s multas. \n", maiorInfratorCodigo, maiorInfrator);
        entrada.close();
    }
}
