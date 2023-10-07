package med.voll.api.domain.appointment.validations;

import med.voll.api.domain.ValidationException;
import med.voll.api.domain.appointment.AppointmentRepository;
import med.voll.api.domain.appointment.DataAppointmentScheduling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidationDoctorAnotherAppointmentAtTheSameTime implements ValidatorAppointmentScheduling {
    @Autowired
    private AppointmentRepository repository;

    public void validate(DataAppointmentScheduling data) {
        var doctorHasAnotherAppointmentAtTheSameTime = repository.existsByDoctorIdAndDate(data.idDoctor(), data.date());
        if(doctorHasAnotherAppointmentAtTheSameTime) {
            throw new ValidationException("Doctor alreary has another appointment scheduled at the same time.");
        }
    }
}
