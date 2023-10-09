package med.voll.api.domain.doctor;

import med.voll.api.domain.appointment.Appointment;
import med.voll.api.domain.appointment.DataDetailAppointment;
import med.voll.api.domain.patient.Patient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class DoctorRepositoryTest {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private TestEntityManager em;

    @Test
    @DisplayName("Return null when the only doctor registered is not available at the date.")
    void chooseRandomDoctorFreeOnDateScenario1() {
        var nextMondayAt10 = LocalDateTime.now()
                .with(TemporalAdjusters.next(DayOfWeek.MONDAY))
                .toLocalDate().atTime(10, 0);

        var doctor = registerDoctor("Doctor", "doctor@voll.med", "123456", Specialty.CARDIOLOGIA);
        var patient = registerPatient("Patient", "patient@email.com", "22233344499");
        registerAppointment(doctor, patient, nextMondayAt10);

        var freeDoctor = doctorRepository.chooseRandomDoctorFreeOnDate(Specialty.CARDIOLOGIA, nextMondayAt10);
        assertThat(freeDoctor).isNull();
    }

    private void registerAppointment(Doctor doctor, Patient patient, LocalDateTime date) {
        em.persist(new Appointment(null, doctor, patient, date, null));
    }

    private Doctor registerDoctor(String name, String email, String crm, Specialty specialty) {
        var doctor = new Doctor(dataDoctor(name, email, crm, specialty));
        em.persist(doctor);
        return doctor;
    }

    private Patient registerPatient(String name, String email, String cpf) {
        var patient = new Patient(dataPatient(name, email, cpf));
        em.persist(patient);
        return patient;
    }

    private DataRegisterDoctor dataDoctor(String name, String email, String crm, Specialty specialty) {
        return new DataRegisterDoctor(
                name,
                email,
                "61999999999",
                crm,
                specialty,
                dataAddress()
        );
    }

    private DataRegisterPatient dataPatient(String name, String email, String cpf) {
        return new DataRegisterPatient(
                name,
                email,
                "61999999999",
                cpf,
                dataAddress()
        );
    }

    private DataAddress dataAddress() {
        return new DataAddress(
                "rua xpto",
                "bairro",
                "00000000",
                "Brasilia",
                "DF",
                null,
                null
        );
    }

}