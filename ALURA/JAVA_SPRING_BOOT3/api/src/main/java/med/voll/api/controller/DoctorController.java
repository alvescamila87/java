
package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctor.DataListDoctor;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorRegistrationData;
import med.voll.api.doctor.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<DataListDoctor> list() {
        return repository.findAll().stream().map(DataListDoctor::new).toList();
    }
    
}
