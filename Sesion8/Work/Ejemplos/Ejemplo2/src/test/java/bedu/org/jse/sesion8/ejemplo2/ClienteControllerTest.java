package bedu.org.jse.sesion8.ejemplo2;

import bedu.org.jse.sesion8.ejemplo2.controllers.ClienteController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static sun.nio.cs.Surrogate.is;

@AutoConfigureRestDocs
@WebMvcTest(ClienteController.class)

class ClienteControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void obtenClienteTest() throws Exception {

        mockMvc.perform(get("/cliente/{clienteId}", 1)
                        .content(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect((ResultMatcher) content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect((ResultMatcher) jsonPath("$.id", is(1)))
                .andExpect((ResultMatcher) jsonPath("$.correoContacto", is(Integer.parseInt("cliente@contacto.com"))))
                .andExpect((ResultMatcher) jsonPath("$.nombre", is(Integer.parseInt("Nombre"))))

                .andDo(document("cliente/get-cliente",
                pathParameters(
                        parameterWithName("clienteId").description("Identificador del cliente")
                ),
                responseFields(
                        fieldWithPath("id").description("identificador del cliente"),
                        fieldWithPath("nombre").description("nombre del cliente"),
                        fieldWithPath("correoContacto").description("correo de contacto del cliente"),
                        fieldWithPath("numeroEmpleados").description("número de trabajadores del cliente"),
                        fieldWithPath("direccion").description("domicilio del cliente"))));
    }}