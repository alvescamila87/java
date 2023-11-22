package aula36;

public class TesteContato {

    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Tyrion");
        //contato.setEndereco("Kings Landing");
        //contato.setTelefone("11 99999-5555");

        // relacionamento tem-um endereço
        Endereco endereco = new Endereco();
        endereco.setNomeRua("Game of Thrones");
        endereco.setNumero("n/a");
        endereco.setComplemento("-");
        endereco.setCidade("Kings Landing");
        endereco.setEstado("Westeros");
        endereco.setCep("999999");

        contato.setEndereco(endereco);


        // relacionamento tem-um telefone
        Telefone telefone = new Telefone();
        telefone.setTipo("Celular");
        telefone.setDdd("11");
        telefone.setNumero("99999-5555");

        contato.setTelefone(telefone);

       // teste saída no console
        System.out.println(contato.getNome());

        if(contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        if(contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + " " + contato.getTelefone().getNumero());
        }

        System.out.println(contato.getTelefone());

    }
}
