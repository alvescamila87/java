package exercicios.aula52.e01;

import java.util.Arrays;

public class Agenda extends Contato {

    private Contato[] contatos;

    public Agenda() {
        contatos = new Contato[5];
    }

    public void adicionarContato(Contato c) throws AgendaCheiaException {

        boolean agendaCheia = true;

        for(int i = 0; i < contatos.length; i++) {
            if(contatos[i] == null) {
                contatos[i] = c;
                agendaCheia = false;
                break;
            }
        }

        if(agendaCheia) {
            throw new AgendaCheiaException();
        }

    }

    public int consultarContatoPorNome(String nome) throws ContatoNaoExisteException {

        for (int i = 0; i < contatos.length; i++) {
            if(contatos[i] != null) {
                if(contatos[i].getNome().equalsIgnoreCase(nome)) {
                    return i;
                }
            }
        }
        throw new ContatoNaoExisteException(nome);
    }

    @Override
    public String toString() {
        String s = "";

        for (Contato c : contatos) {

            if(c != null) {
                s += c.toString() + "\n";
            }

        }

        return s;

    }
}
