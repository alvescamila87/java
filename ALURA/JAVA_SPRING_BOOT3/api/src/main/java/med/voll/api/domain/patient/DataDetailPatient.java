package med.voll.api.domain.patient;

import med.voll.api.domain.address.Address;

public record DataDetailPatient(Long id, String name, String cpf, String email, String telephone, Address address) {

    public DataDetailPatient(Patient patient) {
        this(patient.getId(), patient.getName(), patient.getCpf(), patient.getEmail(), patient.getTelephone(), patient.getAddress());
    }
}
