
package med.voll.api.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.domain.doctor.*;
import med.voll.api.domain.doctor.DataListDoctor;
import med.voll.api.domain.doctor.Doctor;
import med.voll.api.domain.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author Camila
 */

@RestController
@RequestMapping("/doctors")
@SecurityRequirement(name = "bearer-key")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    //DTO Doctor Registration Data
    @PostMapping
    @Transactional
    public ResponseEntity input(@RequestBody @Valid DoctorRegistrationData data, UriComponentsBuilder uriBuilder) {
//        System.out.println(data);
        var doctor = new Doctor(data);
        repository.save(doctor);

        var uri = uriBuilder.path("/doctors/{id}").buildAndExpand(doctor.getId()).toUri();

        return ResponseEntity.created(uri).body(new DataDetailDoctor(doctor));
    }

    @GetMapping
    public ResponseEntity <Page<DataListDoctor>> list(@PageableDefault(sort={"name"}) Pageable pageable) {
        var page = repository.findAllByActiveTrue(pageable).map(DataListDoctor::new);

        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity update(@RequestBody @Valid DataUpdateDoctor data) {
        var doctor = repository.getReferenceById(data.id());
        doctor.updateInfo(data);

        return ResponseEntity.ok(new DataDetailDoctor(doctor));
    }

    @DeleteMapping("/{id}")
    @Transactional
    // Exclusão lógica por inativação de registro em DB.
    public ResponseEntity inactivate(@PathVariable Long id) {
        var doctor = repository.getReferenceById(id);
        doctor.inactivate();

        return ResponseEntity.noContent().build();
    }

//    Exclusão física
//    @DeleteMapping("/{id}")
//    @Transactional
//    public void remove(@PathVariable Long id) {
//        repository.deleteById(id);
//        doctor.remove();
//    }

    @GetMapping("/{id}")
    public ResponseEntity detail(@PathVariable Long id) {
        var doctor = repository.getReferenceById(id);

        return ResponseEntity.ok(new DataDetailDoctor(doctor));
    }

}
