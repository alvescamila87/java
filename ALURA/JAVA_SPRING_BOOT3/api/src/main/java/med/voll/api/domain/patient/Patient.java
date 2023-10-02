package med.voll.api.domain.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.domain.address.Address;

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
     private Boolean active;

     public Patient(PatientRegistrationData data) {
        this.active = true;
        this.name = data.name();
        this.email = data.email();
        this.cpf = data.cpf();
        this.telephone = data.telephone();
        this.address = new Address(data.address());
     }

    public void updateInfo(DataUpdatePatient data) {
         if (data.name() != null) {
             this.name = data.name();
         }
         if (data.telephone() != null) {
             this.telephone = data.telephone();
         }
         if (data.address() != null) {
             this.address.updateInfo(data.address());
         }
    }

//    Exclusão física
//    public void remove() {
//         this.active = false;
//    }

    public void inactivate() {
         this.active = false;
    }

}
