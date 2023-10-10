package br.com.camilaalves.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        //System.out.println(userModel.getUsername());

        // erro de usuário quando:
        var user = this.userRepository.findByUsername(userModel.getUsername());

        if (user != null) {
            //System.out.println("Usuário já cadastrado!");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já cadastrado.");
        }

        // usuário cadastrado com sucesso:
        var userCreated = this.userRepository.save(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }
}
