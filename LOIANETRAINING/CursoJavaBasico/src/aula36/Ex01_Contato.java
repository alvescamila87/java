package aula36;

public class Ex01_Contato {

    private String nome;
    private String email;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String obterInfo() {
        return "Nome = " + nome + ";" +
                "Telefone = " + telefone + ";" +
                "E-mail = " + email;
    }
}
