package med.voll.api.controller;

import med.voll.api.domain.appointment.AppointmentsSchedule;
import med.voll.api.domain.appointment.DataAppointmentScheduling;
import med.voll.api.domain.appointment.DataDetailAppointment;
import med.voll.api.domain.doctor.Specialty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class AppointmentControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private JacksonTester<DataAppointmentScheduling> dataAppointmentSchedulingJacksonTester;

    @Autowired
    private JacksonTester<DataDetailAppointment> dataDetailAppointmentJacksonTester;

    @MockBean
    private AppointmentsSchedule appointmentsSchedule;

    @Test
    @DisplayName("Should return 'HTTP 400 code' when info is invalid.")
    @WithMockUser
    void schedule_scenario1() throws Exception {
        var response = mvc
                .perform(post("/appointments"))
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.BAD_REQUEST.value());
    }

    @Test
    @DisplayName("Should return 'HTTP 200 code' when info is valid.")
    @WithMockUser
    void schedule_scenario2() throws Exception {
        var date = LocalDateTime.now().plusHours(1);
        var specialty = Specialty.CARDIOLOGIA;

        var dataDetail = new DataDetailAppointment(null, 2l, 5l, date);
        when(appointmentsSchedule.schedule(any())).thenReturn(dataDetail);

        var response = mvc
                .perform(
                        post("/appointments")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(dataAppointmentSchedulingJacksonTester.write(
                                        new DataAppointmentScheduling(2l, 5l, date, specialty)
                                ).getJson())
                )
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());

        var JsonExpected = dataDetailAppointmentJacksonTester.write(
                dataDetail
        ).getJson();

        assertThat(response.getContentAsString()).isEqualTo(JsonExpected);
    }
}