package med.voll.api.doctor;

import med.voll.api.address.AddressInfo;

public record DoctorRegistrationData(String name, String email, String crm, Specialty specialty, AddressInfo address) {
}
