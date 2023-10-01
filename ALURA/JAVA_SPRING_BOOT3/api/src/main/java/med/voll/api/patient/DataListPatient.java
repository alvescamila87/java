package med.voll.api.patient;

public record DataListPatient(
        String name,
        String email,
        String cpf) {

    public DataListPatient(Patient patient) {
        this(patient.getName(), patient.getEmail(), patient.getCpf());
    }
}
