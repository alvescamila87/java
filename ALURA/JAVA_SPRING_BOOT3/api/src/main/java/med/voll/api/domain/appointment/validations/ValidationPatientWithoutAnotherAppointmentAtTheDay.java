package med.voll.api.domain.appointment.validations;

import med.voll.api.domain.ValidationException;
import med.voll.api.domain.appointment.AppointmentRepository;
import med.voll.api.domain.appointment.DataAppointmentScheduling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidationPatientWithoutAnotherAppointmentAtTheDay implements ValidatorAppointmentScheduling {
    @Autowired
    private AppointmentRepository repository;

    public void validate(DataAppointmentScheduling data) {
        var firstAppointment = data.date().withHour(7);
        var lastAppointment = data.date().withHour(18);
        var patientHasAnotherAppointmentAtTheDay = repository.existsByPatientIdAndDateBetween(data.idPatient(), firstAppointment, lastAppointment);
        if(patientHasAnotherAppointmentAtTheDay) {
            throw new ValidationException("Patient alreary has another appointment scheduled at the same day.");
        }
    }
}