package aula46;

public interface SqlMDL {

    void select(String query);
    void insert(String query);
    void delete(String query);
    void update(String query);
}
