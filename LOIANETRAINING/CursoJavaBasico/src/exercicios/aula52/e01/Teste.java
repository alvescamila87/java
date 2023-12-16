package exercicios.aula52.e01;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {

            opcao = obterOpcaoMenu(entrada);

            if(opcao == 1) { // Consultar contato
                consultarContato(entrada, agenda);
            } else if(opcao == 2) { // Adicionar contato
                adicionarContato(entrada, agenda);
            }

        }

    }

    public static void adicionarContato(Scanner entrada, Agenda agenda) {

        System.out.println("Criando um contato, entre com as informações");
        String nome = leInformacaoString(entrada, "Entre com o nome do contato: ");
        String email = leInformacaoString(entrada, "Entre com o e-mail do contato: ");
        String telefone = leInformacaoString(entrada, "Entre com o telefone do contato: ");

        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setEmail(email);
        contato.setTelefone(telefone);

        System.out.println("Conato a ser criado: ");
        System.out.println(contato);

        try {
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }

    }

    public static void consultarContato(Scanner entrada, Agenda agenda) {

        String nomeContato = leInformacaoString(entrada, "Entre com o nome do contato a ser pesquisado: ");

        try {

            if(agenda.consultarContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe");
            }

        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String leInformacaoString (Scanner entrada, String msg) {
        System.out.println(msg);
        String opcaoEntrada = entrada.nextLine();
        return opcaoEntrada;
    }

    public static int obterOpcaoMenu(Scanner entrada) {

        boolean entradaValida = false;
        int opcao = 3;

        while(!entradaValida) {

            System.out.println("");
            System.out.println("[1] Consultar contato");
            System.out.println("[2] Adicionar contato");
            System.out.println("[3] Sair");
            System.out.println("");
            System.out.println("Digite a opção desejada: ");

            try {
                String opcaoEntrada = entrada.nextLine();
                opcao = Integer.parseInt(opcaoEntrada);

                if(opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida");
                }
            }
            catch (Exception e) {
                System.out.println("Entrada inválida! Digite novamente");
            }
        }

        return opcao;

    }

}
