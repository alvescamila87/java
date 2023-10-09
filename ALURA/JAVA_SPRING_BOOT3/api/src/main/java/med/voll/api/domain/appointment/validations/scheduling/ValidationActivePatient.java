package med.voll.api.domain.appointment.validations.scheduling;

import med.voll.api.domain.ValidationException;
import med.voll.api.domain.appointment.DataAppointmentScheduling;
import med.voll.api.domain.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidationActivePatient implements ValidatorAppointmentScheduling {
    @Autowired
    private PatientRepository repository;

    public void validate(DataAppointmentScheduling data) {

        var patientIsActive = repository.findActiveById(data.idPatient());

        if (!patientIsActive) {
            throw new ValidationException("Appointment may not be scheduled with removed patient.");
        }
    }
}
