package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.patient.DataListPatient;
import med.voll.api.domain.patient.Patient;
import med.voll.api.domain.patient.PatientRepository;
import med.voll.api.domain.patient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    // DTO Patient Registration Data
    @PostMapping
    @Transactional
    public ResponseEntity input(@RequestBody @Valid PatientRegistrationData data, UriComponentsBuilder uriBuilder) {
//        System.out.println(data);
        var patient = new Patient(data);
        repository.save(patient);

        var uri = uriBuilder.path("/patients/{id}").buildAndExpand(patient.getId()).toUri();

        return ResponseEntity.created(uri).body(new DataDetailPatient(patient));
    }
    @GetMapping
    public ResponseEntity <Page<DataListPatient>> list(@PageableDefault(sort={"name"}) Pageable pageable) {
        var page = repository.findAllByActiveTrue(pageable).map(DataListPatient::new);

        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid DataUpdatePatient data) {
        var patient = repository.getReferenceById(data.id());
        patient.updateInfo(data);

        return ResponseEntity.ok(new DataDetailPatient(patient));
    }

//    Exclusão física
//    @DeleteMapping("/{id}")
//    @Transactional
//    public void remove(@PathVariable Long id) {
//        patient.remove();
//    }

    //    Exclusão lógica por inativação de registro DB.
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity inactivate(@PathVariable Long id) {
        var patient = repository.getReferenceById(id);
        patient.inactivate();

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        var patient = repository.getReferenceById(id);

        return ResponseEntity.ok(new DataDetailPatient(patient));
    }
}
