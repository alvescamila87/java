package med.voll.api.domain.appointment.validations.scheduling;

import med.voll.api.domain.ValidationException;
import med.voll.api.domain.appointment.DataAppointmentScheduling;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidationTimeInAdvanceScheduling implements ValidatorAppointmentScheduling {
    public void validate(DataAppointmentScheduling data) {

        var dateAppointment = data.date();
        var now = LocalDateTime.now();
        var differenceInMinutes = Duration.between(now, dateAppointment).toMinutes();

        if(differenceInMinutes < 30) {
            throw new ValidationException("Appointment must be scheduled at least 30 minutes in advance.");
        }
    }
}
