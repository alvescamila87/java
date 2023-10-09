package med.voll.api.domain.appointment.validations.scheduling;
import med.voll.api.domain.ValidationException;
import med.voll.api.domain.appointment.DataAppointmentScheduling;
import med.voll.api.domain.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidationActiveDoctor implements ValidatorAppointmentScheduling {

    @Autowired
    private DoctorRepository repository;

    public void validate(DataAppointmentScheduling data) {

        if (data.idDoctor() == null) {
            return;
        }

        var doctorIsActive = repository.findActiveById(data.idDoctor());
        if (!doctorIsActive) {
            throw new ValidationException("Appointment may not be scheduled with removed doctor.");

        }
    }

}