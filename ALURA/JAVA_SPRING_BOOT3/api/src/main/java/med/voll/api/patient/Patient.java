package med.voll.api.patient;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.address.Address;
import med.voll.api.address.AddressInfo;

@Table(name = "patients")
@Entity(name = "Patient")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {

     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String name;
     private String email;
     private String cpf;
     private String telephone;
     @Embedded
     private Address address;

     public Patient(PatientRegistrationData data) {
        this.name = data.name();
        this.email = data.email();
        this.cpf = data.cpf();
        this.telephone = data.telephone();
        this.address = new Address(data.address());
     }
}
