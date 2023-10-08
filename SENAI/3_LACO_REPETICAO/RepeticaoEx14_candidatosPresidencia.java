import java.util.Scanner;

public class RepeticaoEx14_candidatosPresidencia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int contadorCandidato1 = 0;
        int contadorCandidato2 = 0;
        int contadorCandidato3 = 0;
        int contadorCandidato4 = 0;
        int contadorNulo = 0;
        int contadorEmBranco = 0;

        while (true) {
            System.out.println("Candidatos à Presidência");
            System.out.println("[1] João");
            System.out.println("[2] Maria");
            System.out.println("[3] Pedro");
            System.out.println("[4] Marcos");
            System.out.println("[5] Nulo");
            System.out.println("[6] Em branco");
            System.out.println("[7] Sair");
            System.out.println("Informe o código: ");
            int opcao = entrada.nextInt();

            if (opcao == 7) {
                System.out.println("Programa finalizado!");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Voto para candidato JOÃO realizado com sucesso!");
                    contadorCandidato1++;
                break;
                case 2:
                    System.out.println("Voto para candidato MARIA realizado com sucesso!");
                    contadorCandidato2++;
                break;
                case 3:
                    System.out.println("Voto para candidato PEDRO realizado com sucesso!");
                    contadorCandidato3++;
                break;
                case 4:
                    System.out.println("Voto para candidato MARCOS realizado com sucesso!");
                    contadorCandidato4++;
                break;
                case 5:
                    System.out.println("Voto NULO realizado com sucesso!");
                    contadorNulo++;
                break;
                case 6:
                    System.out.println("Voto EM BRANCO realizado com sucesso!");
                    contadorEmBranco++;
                break;
                default:
                    System.out.println("ERRO: Código de votação inválido!");
            }

            contador++;

        }
        // a) o total de votos para cada candidato;
        System.out.println("Total de votos");
        System.out.printf(" - João: %s votos. \n", contadorCandidato1);
        System.out.printf(" - Maria: %s votos. \n", contadorCandidato2);
        System.out.printf(" - Pedro: %s votos. \n", contadorCandidato3);
        System.out.printf(" - Marcos: %s votos. \n", contadorCandidato4);
        System.out.printf(" - Nulo: %s votos. \n", contadorNulo);
        System.out.printf(" - Em branco: %s votos. \n", contadorEmBranco);

        // d) o percentual de nulos em relação ao total de votos;
        System.out.printf("O percentual de votos nulos em relação total de votos é de %s por cento. \n", (contadorNulo * 100) / contador);

        // e) o percentual de brancos em relação ao total de votos.
        System.out.printf("O percentual de votos em branco em relação total de votos é de %s por cento. \n", (contadorEmBranco * 100) / contador);

        entrada.close();

    }
}
