package med.voll.api.domain.appointment;

import med.voll.api.domain.ValidationException;
import med.voll.api.domain.doctor.Doctor;
import med.voll.api.domain.doctor.DoctorRepository;
import med.voll.api.domain.doctor.Specialty;
import med.voll.api.domain.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentsSchedule {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private PatientRepository patientRepository;

    public void schedule(DataAppointmentScheduling data) {

        if(!patientRepository.existsById(data.idPatient())) {
            throw new ValidationException("ID Patient not found.");
        }

        if(data.idDoctor() != null && !doctorRepository.existsById(data.idDoctor())) {
            throw new ValidationException("ID Doctor not found.");
        }

        var doctor = chooseDoctor(data);
        var patient = patientRepository.getReferenceById(data.idPatient());
        var appointment = new Appointment(null, doctor, patient, data.date(), null);
        appointmentRepository.save(appointment);

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

        var appointment = appointmentRepository.getReferenceById(data.idAppointment());
        appointment.cancel(data.reason());
    }
}
