package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.patient.DataListPatient;
import med.voll.api.patient.Patient;
import med.voll.api.patient.PatientRegistrationData;
import med.voll.api.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    // DTO Patient Registration Data
    @PostMapping
    @Transactional
    public void input(@RequestBody @Valid PatientRegistrationData data) {
//        System.out.println(data);
        repository.save(new Patient(data));
    }
    @GetMapping
    public Page<DataListPatient> list(@PageableDefault(sort={"name"}) Pageable pageable) {
        return repository.findAll(pageable).map(DataListPatient::new);
    }
}
