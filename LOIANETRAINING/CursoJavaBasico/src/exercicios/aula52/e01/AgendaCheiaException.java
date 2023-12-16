package exercicios.aula52.e01;

public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
        return "Agenda já está cheia!";
    }
}
