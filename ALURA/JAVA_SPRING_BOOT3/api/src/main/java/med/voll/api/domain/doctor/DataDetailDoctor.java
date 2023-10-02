package med.voll.api.domain.doctor;

import med.voll.api.domain.address.Address;

public record DataDetailDoctor(Long id, String name, String email, String crm, String telephone, Specialty specialty, Address address) {

    public DataDetailDoctor(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getTelephone(), doctor.getSpecialty(), doctor.getAddress());
    }
}
