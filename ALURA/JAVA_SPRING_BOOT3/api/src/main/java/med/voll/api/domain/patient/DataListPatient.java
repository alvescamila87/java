package med.voll.api.domain.patient;

public record DataListPatient(
        Long id,
        String name,
        String email,
        String cpf) {

    public DataListPatient(Patient patient) {
        this(patient.getId(), patient.getName(), patient.getEmail(), patient.getCpf());
    }
}
