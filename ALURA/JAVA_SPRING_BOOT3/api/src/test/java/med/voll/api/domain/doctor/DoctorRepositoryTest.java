package med.voll.api.domain.doctor;

import med.voll.api.domain.address.Address;
import med.voll.api.domain.address.AddressInfo;
import med.voll.api.domain.appointment.Appointment;
import med.voll.api.domain.patient.Patient;
import med.voll.api.domain.patient.PatientRegistrationData;
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
    private TestEntityManager testEntityManager;

    @Test
    @DisplayName("Should return null when the only doctor registered is not available at the date.")
    void chooseRandomDoctorFreeOnDateScenario1() {

        //given or arrange
        var nextMondayAt10 = LocalDateTime.now()
                .with(TemporalAdjusters.next(DayOfWeek.MONDAY))
                .toLocalDate().atTime(10, 0);


        var doctor = registerDoctor("Doctor", "doctor@voll.med", "123456", Specialty.CARDIOLOGIA);
        var patient = registerPatient("Patient", "patient@email.com", "22233344499");
        registerAppointment(doctor, patient, nextMondayAt10);

        //when or act
        var freeDoctor = doctorRepository.chooseRandomDoctorFreeOnDate(Specialty.CARDIOLOGIA, nextMondayAt10);

        //then or assert
        assertThat(freeDoctor).isNull();

    }

    @Test
    @DisplayName("Should return a doctor when the doctor is available at the date.")
    void chooseRandomDoctorFreeOnDateScenario2() {
        //given or arrange
        var nextMondayAt10 = LocalDateTime.now()
                .with(TemporalAdjusters.next(DayOfWeek.MONDAY))
                .toLocalDate().atTime(10, 0);

        var doctor = registerDoctor("Doctor", "doctor@voll.med", "123456", Specialty.CARDIOLOGIA);

        //when or act
        var freeDoctor = doctorRepository.chooseRandomDoctorFreeOnDate(Specialty.CARDIOLOGIA, nextMondayAt10);

        //then or assert
        assertThat(freeDoctor).isEqualTo(doctor);
    }

    private void registerAppointment(Doctor doctor, Patient patient, LocalDateTime date) {
        testEntityManager.persist(new Appointment(null, doctor, patient, date, null));
    }

    private Doctor registerDoctor(String name, String email, String crm, Specialty specialty) {
        var doctor = new Doctor(dataDoctor(name,email,crm,specialty));
        testEntityManager.persist(doctor);
        return doctor;
    }

    private Patient registerPatient(String name, String email, String cpf) {
        var patient = new Patient(dataPatient(name, email, cpf));
        testEntityManager.persist(patient);
        return patient;
    }

    // record Doctor
    private DoctorRegistrationData dataDoctor(String name, String email, String crm, Specialty specialty) {
        return new DoctorRegistrationData(
                name,
                email,
                "61999999999",
                crm,
                specialty,
                address()
        );
    }

    // record Patient
    private PatientRegistrationData dataPatient(String name, String email, String cpf) {
        return new PatientRegistrationData(
                name,
                email,
                "61999999999",
                cpf,
                address()
        );
    }

    // record Address
    private AddressInfo address() {
        return new AddressInfo(
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