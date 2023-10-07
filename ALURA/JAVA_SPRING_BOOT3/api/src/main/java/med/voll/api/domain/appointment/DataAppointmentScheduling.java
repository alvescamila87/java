package med.voll.api.domain.appointment;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.doctor.Specialty;

import java.time.LocalDateTime;

public record DataAppointmentScheduling(
        Long idDoctor,

        @NotNull
        Long idPatient,

        @NotNull
        @Future
        //@JsonFormat(pattern = "yyyy/mm/ddThh:mm")
        LocalDateTime date,

        Specialty specialty) {

}
