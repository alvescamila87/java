package med.voll.api.domain.appointment.validations.cancellation;

import med.voll.api.domain.appointment.DataCancelAppointment;

public interface ValidatorCancellationAppointment {

    void validate(DataCancelAppointment data);
}
