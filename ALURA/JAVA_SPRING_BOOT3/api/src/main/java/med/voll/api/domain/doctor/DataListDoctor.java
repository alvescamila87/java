package med.voll.api.domain.doctor;

public record DataListDoctor(
        Long id,
        String name,
        String email,
        String crm,
        Specialty specialty) {

    public DataListDoctor(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }
}
