package med.voll.api.controller;

import med.voll.api.domain.address.Address;
import med.voll.api.domain.address.AddressInfo;
import med.voll.api.domain.appointment.DataDetailAppointment;
import med.voll.api.domain.doctor.*;
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
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
class DoctorControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private JacksonTester<DoctorRegistrationData> doctorRegistrationDataJacksonTester;

    @Autowired
    private JacksonTester<DataDetailDoctor> dataDetailDoctorJacksonTester;

    @MockBean
    private DoctorRepository doctorRepository;

    @Test
    @DisplayName("Should return 'HTTP 400 code' when indo is invalid.")
    @WithMockUser
    void input_scenario1() throws Exception {
        var response = mvc
                .perform(post("/doctors"))
                .andReturn().getResponse();

        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.BAD_REQUEST.value());
    }

    @Test
    @DisplayName("Should return 'HTTP 200 code' when indo is valid.")
    @WithMockUser
    void input_scenario2() throws Exception {

        var dataRegistration = new DoctorRegistrationData(
                "Doctor",
                "doctor@voll.med",
                "47999654563",
                "123456",
                Specialty.ORTOPEDIA,
                dataAddress()
        );

        when(doctorRepository.save(any())).thenReturn(new Doctor(dataRegistration));

        var response = mvc
                .perform(
                        post("/doctors")
                                .contentType(MediaType.APPLICATION_JSON)
                                .content(doctorRegistrationDataJacksonTester.write(dataRegistration).getJson()))
                .andReturn().getResponse();

        var dataDetail = new DataDetailDoctor(
                null,
                dataRegistration.name(),
                dataRegistration.email(),
                dataRegistration.crm(),
                dataRegistration.telephone(),
                dataRegistration.specialty(),
                new Address(dataRegistration.address())
        );

        var jsonExpected = dataDetailDoctorJacksonTester.write(dataDetail).getJson();


        assertThat(response.getStatus())
                .isEqualTo(HttpStatus.CREATED.value());

        assertThat(response.getContentAsString())
                .isEqualTo(jsonExpected);
    }

    private AddressInfo dataAddress() {
        return new AddressInfo(
                "street yellow tree",
                "center downtown",
                "12345678",
                "Pomerode",
                "SC",
                "50",
                ""
        );
    }
}