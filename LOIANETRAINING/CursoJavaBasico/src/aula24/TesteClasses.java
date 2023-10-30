package aula24;

import java.sql.SQLOutput;
import java.util.Date;

public class TesteClasses {

    public static void main(String[] args) {

        // lampada
        Lampada lampadaPadrao = new Lampada();
        lampadaPadrao.cor = "Branca";
        lampadaPadrao.marca = "Philips";
        lampadaPadrao.potencia = 30;

        lampadaPadrao.tipos = new String[3];
        lampadaPadrao.tipos[0] = "Abajur";
        lampadaPadrao.tipos[1] = "LED";
        lampadaPadrao.tipos[2] = "Normal";

        System.out.println("\n- Classe Lâmpada");
        System.out.println("Marca: " + lampadaPadrao.marca);
        System.out.println("Cor: " + lampadaPadrao.cor);
        System.out.println("Potência: " + lampadaPadrao.potencia + "watts");
        System.out.println("Tipo de luz: " + lampadaPadrao.tipos[0]);
        System.out.println("Tipo de luz: " + lampadaPadrao.tipos[1]);
        System.out.println("Tipo de luz: " + lampadaPadrao.tipos[2]);

        // Conta corrente
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.limite = 1000;
        contaCorrente.numero = 3333;
        contaCorrente.saldo = 1000000;
        contaCorrente.statusSpecial = true;

        System.out.println("\n- Classe Conta corrente");
        System.out.println("Limite C/C: " + contaCorrente.limite);
        System.out.println("Saldo C/C: " + contaCorrente.saldo);
        System.out.println("Número C/C: " + contaCorrente.numero);
        System.out.println("Status C/C especial: " + contaCorrente.statusSpecial);

        // Livro
        Livro livro = new Livro();
        livro.autor = "Tolkien";
        livro.idioma = "English";
        livro.numeroPaginas = 560;
        livro.titulo = "O Atlas da Terra-média";

        System.out.println("\n- Classe Livro");
        System.out.println("Autor: " + livro.autor);
        System.out.println("Título: " + livro.titulo);
        System.out.println("Quantidade páginas: " + livro.numeroPaginas);
        System.out.println("Idioma: " + livro.idioma);

        // Livro de livraria
        LivroDeLivraria livroDeLivraria = new LivroDeLivraria();
        livroDeLivraria.preco = 159.90;
        livroDeLivraria.autor = "Daniel Rops";

        System.out.println("\n- Classe Livro de Livraria");
        System.out.println("Preço: " + livroDeLivraria.preco);
        System.out.println("Autor: " + livroDeLivraria.autor);

        // Livro de livraria
        LivroDeBiblioteca livroDeBiblioteca = new LivroDeBiblioteca();
        livroDeBiblioteca.emEmprestimo = true;
        livroDeBiblioteca.codigoLocalizacao = "VWV6V516";
        livroDeBiblioteca.dataEmprestimo = new Date();
        livroDeBiblioteca.dataRetornoEmprestimo = new Date();

        System.out.println("\n- Classe Livro de Biblioteca");
        System.out.println("Em empréstimo: " + livroDeBiblioteca.emEmprestimo);
        System.out.println("Código de localização: " + livroDeBiblioteca.codigoLocalizacao);
        System.out.println("Data de empréstimo: " + livroDeBiblioteca.dataEmprestimo);
        System.out.println("Data de retorno do empréstimo: " + livroDeBiblioteca.dataRetornoEmprestimo);

        // Contato agenda
        ContatoAgenda contatoAgenda = new ContatoAgenda();
        contatoAgenda.nome = "Guilherme";

        contatoAgenda.numeroCelulares = new String[5];
        contatoAgenda.numeroCelulares[0] = "47999995555";
        contatoAgenda.numeroCelulares[1] = "47999944444";
        contatoAgenda.sobrenome = "Guigo S";

        System.out.println("\n- Classe Contato Agenda");
        System.out.println("Nome: " + contatoAgenda.nome);
        System.out.println("Sobrenome: " + contatoAgenda.sobrenome);
        System.out.println("Número celular 1: " + contatoAgenda.numeroCelulares[0]);
        System.out.println("Número celular 2: " + contatoAgenda.numeroCelulares[1]);

    }


}
