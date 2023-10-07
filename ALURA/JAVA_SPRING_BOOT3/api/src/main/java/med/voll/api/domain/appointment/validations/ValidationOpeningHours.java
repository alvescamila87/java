package med.voll.api.domain.appointment.validations;

import med.voll.api.domain.ValidationException;
import med.voll.api.domain.appointment.DataAppointmentScheduling;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidationOpeningHours implements ValidatorAppointmentScheduling {

    public void validate(DataAppointmentScheduling data) {
        var dateAppointment = data.date();

        var sunday = dateAppointment.getDayOfWeek().equals(DayOfWeek.SUNDAY);

        var beforeOpeningHours = dateAppointment.getHour() < 7;

        var afterOpeningHours = dateAppointment.getHour() > 18;

        if (sunday || beforeOpeningHours || afterOpeningHours) {
            throw new ValidationException("Appointment outside clinic opening hours.");
        }
    }
}
