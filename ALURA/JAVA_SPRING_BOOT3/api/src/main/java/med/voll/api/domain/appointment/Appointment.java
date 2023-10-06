package med.voll.api.domain.appointment;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.doctor.Doctor;
import med.voll.api.domain.patient.Patient;

import java.time.LocalDateTime;

@Table(name = "appointments")
@Entity(name = "Appointment")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    //@Pattern(regexp = "yyyy/mm/ddThh:mm")
    private LocalDateTime date;

    @Column(name = "reason_cancellation")
    @Enumerated(EnumType.STRING)
    private ReasonForCancellation reasonForCancellation;

    public void cancel(ReasonForCancellation reason) {
        this.reasonForCancellation = reason;
    }
}
