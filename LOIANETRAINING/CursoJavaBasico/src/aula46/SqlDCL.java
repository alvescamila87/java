package aula46;

public interface SqlDCL {

    void grant(String access);
    void revoke(String access);
}
