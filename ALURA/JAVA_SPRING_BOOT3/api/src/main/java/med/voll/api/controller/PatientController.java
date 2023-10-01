package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.patient.*;
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
        return repository.findAllByActiveTrue(pageable).map(DataListPatient::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DataUpdatePatient data) {
        var patient = repository.getReferenceById(data.id());
        patient.updateInfo(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void remove(@PathVariable Long id) {
        var patient = repository.getReferenceById(id);
        patient.remove();
    }
}
