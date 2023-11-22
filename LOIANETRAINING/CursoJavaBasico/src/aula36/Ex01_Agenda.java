package aula36;

// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-36

public class Ex01_Agenda {

    private String nome;
    private Ex01_Contato[] contatos;

    public Ex01_Agenda() {
    }

    public Ex01_Agenda(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ex01_Contato[] getContatos() {
        return contatos;
    }

    public void setContatos(Ex01_Contato[] contatos) {
        this.contatos = contatos;
    }

    public String obterInfo() {
        String info = "Nome = " + nome + "\n";

        if(contatos!= null) {
            for (Ex01_Contato c : contatos) {
                info += c.obterInfo() + "\n";
            }
        }

        return info;
    }
}
