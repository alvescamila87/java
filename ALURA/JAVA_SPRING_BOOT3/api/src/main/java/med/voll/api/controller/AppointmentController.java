package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.appointment.DataAppointmentScheduling;
import med.voll.api.domain.appointment.DataDetailAppointment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    @PostMapping
    @Transactional
    public ResponseEntity schedule(@RequestBody @Valid DataAppointmentScheduling data) {
        System.out.println(data);
        return ResponseEntity.ok(new DataDetailAppointment(null, null, null, null));
    }

}
