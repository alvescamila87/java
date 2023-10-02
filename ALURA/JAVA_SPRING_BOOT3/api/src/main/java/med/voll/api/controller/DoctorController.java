
package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 *
 * @author Camila
 */

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    //DTO Doctor Registration Data
    @PostMapping
    @Transactional
    public void input(@RequestBody @Valid DoctorRegistrationData data) {
//        System.out.println(data);
        repository.save(new Doctor(data));
    }

    @GetMapping
    public Page<DataListDoctor> list(@PageableDefault(sort={"name"}) Pageable pageable) {
        return repository.findAllByActiveTrue(pageable).map(DataListDoctor::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DataUpdateDoctor data) {
        var doctor = repository.getReferenceById(data.id());
        doctor.updateInfo(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    // Exclusão lógica por inativação de registro em DB.
    public void inactivate(@PathVariable Long id) {
    var doctor = repository.getReferenceById(id);
    doctor.inactivate();
    }

//    Exclusão física
//    @DeleteMapping("/{id}")
//    @Transactional
//    public void remove(@PathVariable Long id) {
//        repository.deleteById(id);
//        doctor.remove();
//    }

}
