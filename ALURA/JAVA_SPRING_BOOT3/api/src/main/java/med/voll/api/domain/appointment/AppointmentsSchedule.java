package med.voll.api.domain.appointment;

import med.voll.api.domain.ValidationException;
import med.voll.api.domain.appointment.validations.scheduling.ValidatorAppointmentScheduling;
import med.voll.api.domain.appointment.validations.cancellation.ValidatorCancellationAppointment;
import med.voll.api.domain.doctor.Doctor;
import med.voll.api.domain.doctor.DoctorRepository;
import med.voll.api.domain.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentsSchedule {

    @Autowired
    private List<ValidatorCancellationAppointment> validationsCancellation;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private List<ValidatorAppointmentScheduling> validations;

    public DataDetailAppointment schedule(DataAppointmentScheduling data) {

        if(!patientRepository.existsById(data.idPatient())) {
            throw new ValidationException("ID Patient not found.");
        }

        if(data.idDoctor() != null && !doctorRepository.existsById(data.idDoctor())) {
            throw new ValidationException("ID Doctor not found.");
        }

        validations.forEach(v -> v.validate(data));

        var doctor = chooseDoctor(data);

        if (doctor == null) {
            throw new ValidationException("There is no doctor available at this date.");
        }
        var patient = patientRepository.getReferenceById(data.idPatient());
        var appointment = new Appointment(null, doctor, patient, data.date(), null);
        appointmentRepository.save(appointment);

        return new DataDetailAppointment(appointment);

    }

    private Doctor chooseDoctor(DataAppointmentScheduling data) {
        if (data.idDoctor() != null) {
            return doctorRepository.getReferenceById(data.idDoctor());
        }

        if(data.specialty() == null) {
            throw new ValidationException("Specialty must NOT be blank when a doctor is not chosen.");
        }

        return doctorRepository.chooseRandomDoctorFreeOnDate(data.specialty(), data.date());
    }

    public void cancel(DataCancelAppointment data) {
        if(!appointmentRepository.existsById(data.idAppointment())) {
            throw new ValidationException("ID Appointment not found.");
        }

        validationsCancellation.forEach(v -> v.validate(data));

        var appointment = appointmentRepository.getReferenceById(data.idAppointment());
        appointment.cancel(data.reason());
    }
}
