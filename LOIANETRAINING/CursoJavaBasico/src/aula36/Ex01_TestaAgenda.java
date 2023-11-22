package aula36;

import java.util.Scanner;

public class Ex01_TestaAgenda {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Ex01_Agenda agenda = new Ex01_Agenda();
        System.out.println("Informe o nome da agenda: ");
        agenda.setNome(entrada.nextLine());

        Ex01_Contato[] contatos = new Ex01_Contato[2];

        for (int i = 0; i < 2; i++)
        {
            System.out.println("Entre com as informações do contato " + (i+1));
            Ex01_Contato c = new Ex01_Contato();

            System.out.println("Informe o nome do contato: ");
            c.setNome(entrada.nextLine());

            System.out.println("Informe o e-mail do contato: ");
            c.setEmail(entrada.nextLine());

            System.out.println("Informe o telefone do contato: ");
            c.setTelefone(entrada.nextLine());

            contatos[i] = c;

        }

        agenda.setContatos(contatos);

        if(agenda != null) {

            System.out.println(agenda.obterInfo());

        }

    }
}
