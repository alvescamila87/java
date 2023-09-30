package med.voll.api.doctor;

public record DataListDoctor(
        String nome,
        String email,
        String crm,
        Specialty specialty) {

    public DataListDoctor(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }
}
