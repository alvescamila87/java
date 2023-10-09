package med.voll.api.domain.appointment;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    boolean existsByDoctorIdAndDateAndReasonForCancellationIsNull(Long idDoctor, LocalDateTime date);

    boolean existsByPatientIdAndDateBetween(Long idPatient, LocalDateTime firstAppointment, LocalDateTime lastAppointment);
}
