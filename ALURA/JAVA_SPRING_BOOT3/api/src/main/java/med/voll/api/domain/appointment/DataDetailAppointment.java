package med.voll.api.domain.appointment;

import java.time.LocalDateTime;

public record DataDetailAppointment(
        Long id,
        Long idDoctor,
        Long idPatient,
        LocalDateTime date) {
    public DataDetailAppointment(Appointment appointment) {
        this(appointment.getId(), appointment.getDoctor().getId(), appointment.getPatient().getId(), appointment.getDate());
    }
}
