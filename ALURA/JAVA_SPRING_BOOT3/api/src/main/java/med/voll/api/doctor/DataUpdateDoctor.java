package med.voll.api.doctor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.address.AddressInfo;

public record DataUpdateDoctor(
        @NotNull
        Long id,
        String name,
        String telephone,
        @Valid
        AddressInfo address) {
}