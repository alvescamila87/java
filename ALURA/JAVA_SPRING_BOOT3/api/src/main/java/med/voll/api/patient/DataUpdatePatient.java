package med.voll.api.patient;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.address.AddressInfo;

public record DataUpdatePatient(
        @NotNull
        Long id,
        String name,
        String telephone,
        @Valid
        AddressInfo address) {
}
