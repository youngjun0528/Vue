package com.taskagile.web.apis;

import com.taskagile.domain.application.UserService;
import com.taskagile.domain.model.user.EmailAddressExistsException;
import com.taskagile.domain.model.user.UsernameExistsException;
import com.taskagile.utils.JsonUtils;
import com.taskagile.web.payload.RegistrationPayload;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * RegistrationApiControllerTests
 */
@RunWith(SpringRunner.class)
@WebMvcTest(RegistrationApiController.class)
public class RegistrationApiControllerTests {
    @Autowired
    private MockMvc mvc;

    @Test
    public void register_blankPayload_shouldFailAndReturn4O0() throws Exception {
        mvc.perform(post("/api/registrations")).andExpect(status().is(400));
    }

    @MockBean

    private UserService serviceMock;

    @Test
    public void register_existedUsername_shouldFailAndReturn400() throws Exception {
        RegistrationPayload payload = new RegistrationPayload();
        payload.setUsername("exist");
        payload.setEmailAddress("test@taskagile.com");
        payload.setPassword("MyPassword!");
        doThrow(EmailAddressExistsException.class).when(serviceMock).register(payload.toCommand());
        mvc.perform(
                post("/api/registrations").contentType(MediaType.APPLICATION_JSON).content(JsonUtils.toJson(payload)))
                .andExpect(status().is(400)).andExpect(jsonPath("$.message").value("Username already exists"));
    }
}
