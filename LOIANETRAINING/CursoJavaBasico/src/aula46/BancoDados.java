package aula46;

public interface BancoDados extends SqlDDL, SqlDCL, SqlMDL {

    void abrirConexao();
    void fecharConexao();
}
