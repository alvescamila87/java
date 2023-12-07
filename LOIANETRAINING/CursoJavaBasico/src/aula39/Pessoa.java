package aula39;

public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    String nomeVisivel;


    public Pessoa() {

        nomeVisivel="jfhbdsfjkhbsjdkf";
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeVisivel() {
        return nomeVisivel;
    }

    public void setNomeVisivel(String nomeVisivel) {
        this.nomeVisivel = nomeVisivel;
    }

}
