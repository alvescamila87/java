package med.voll.api.domain.patient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.address.AddressInfo;

public record PatientRegistrationData(

    @NotBlank
    String name,
    @NotBlank
    @Email
    String email,
    @NotBlank
    String telephone,
    @NotBlank
    @Pattern(regexp = "\\d{11}")
    String cpf,
    @NotNull
    @Valid
    AddressInfo address) {
}
