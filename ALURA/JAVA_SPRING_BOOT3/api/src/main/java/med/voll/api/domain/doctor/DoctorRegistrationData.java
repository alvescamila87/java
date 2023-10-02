package med.voll.api.domain.doctor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.address.AddressInfo;

public record DoctorRegistrationData(
        @NotBlank(message = "Name must not be blank")
        String name,
        @NotBlank(message = "Email must not be blank")
        @Email(message = "Invalid email format")
        String email,
        @NotBlank(message = "Telephone must not be blank")
        String telephone,

        @NotBlank(message = "CRM must not be blank")
        @Pattern(regexp = "\\d{4,6}", message = "Invalid CRM format")
        String crm,
        @NotNull(message = "Specialty must not be blank")
        Specialty specialty,
        @NotNull(message = "Addreess must not be blank")
        @Valid
        AddressInfo address) {
}
