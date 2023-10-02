package med.voll.api.domain.doctor;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.address.AddressInfo;

public record DataUpdateDoctor(
        @NotNull
        Long id,
        String name,
        String telephone,
        @Valid
        AddressInfo address) {
}
