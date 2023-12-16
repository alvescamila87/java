package exercicios.aula52.e01;

public class Contato {

    private static int contador = 0;
    private int identificador;
    private String nome;
    private String telefone;
    private String email;

    public Contato() {
        contador++;
        identificador = contador;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        String s = "[";
        s += "ID: " + identificador;
        s += ", Nome: " + nome;
        s += ", E-mail: " + email;
        s += ", Telefone: " + telefone;
        s += "]";
        return s;
    }
}
