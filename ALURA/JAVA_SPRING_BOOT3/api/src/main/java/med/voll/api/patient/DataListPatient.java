package med.voll.api.patient;

public record DataListPatient(
        Long id,
        String name,
        String email,
        String cpf) {

    public DataListPatient(Patient patient) {
        this(patient.getId(), patient.getName(), patient.getEmail(), patient.getCpf());
    }
}
