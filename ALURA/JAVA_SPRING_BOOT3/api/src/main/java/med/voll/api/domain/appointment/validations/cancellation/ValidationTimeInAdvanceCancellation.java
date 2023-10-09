package med.voll.api.domain.appointment.validations.cancellation;

import med.voll.api.domain.ValidationException;
import med.voll.api.domain.appointment.AppointmentRepository;
import med.voll.api.domain.appointment.DataCancelAppointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidationTimeInAdvanceCancellation implements ValidatorCancellationAppointment {

    @Autowired
    private AppointmentRepository repository;

    @Override
    public void validate(DataCancelAppointment data) {
        var appointment = repository.getReferenceById(data.idAppointment());
        var now = LocalDateTime.now();
        var differenceInHours = Duration.between(now, appointment.getDate()).toHours();

        if (differenceInHours < 24) {
            throw new ValidationException("Appointment can only be cancelled at least 24 hours in advance. ");
        }
    }
}
