package bedu.org.jse.sesion8.ejemplo3.controllers;

import bedu.org.jse.sesion8.ejemplo3.model.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.http.RequestEntity.post;
import static org.springframework.restdocs.headers.HeaderDocumentation.headerWithName;
import static org.springframework.restdocs.headers.HeaderDocumentation.responseHeaders;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureRestDocs (uriScheme = "https", uriHost = "bedu.org/rest", uriPort = 80)
@WebMvcTest(ClienteController.class)

class ClienteControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void creaClienteTest() throws Exception {
        Cliente clienteParametro = Cliente.builder().nombre("Nombre").direccion("Direccion").numeroEmpleados(10).correoContacto("contacto@cliente.com").build();

        mockMvc.perform(post("/cliente")
                        .contentType(MediaType.APPLICATION_JSON)
                        .contentType(new ObjectMapper().writeValueAsString(clienteParametro)))
                .andExpect(status().isCreated())
                .andDo(document("cliente/post-cliente",
                        requestFields(
                                fieldWithPath("id").description("El identificador del nuevo cliente"),
                                fieldWithPath("nombre").description("El nombre del cliente"),
                                fieldWithPath("direccion").description("La dirección del cliente"),
                                fieldWithPath("correoContacto").description("La dirección de correo electrónico de contacto"),
                                fieldWithPath("numeroEmpleados").description("El número de personas que trabajan en las oficinas e cliente")
                        ),
                        responseHeaders(
                                headerWithName("Location").description("La ubicación del recurso (su identificador generado")
                        ))
                );

    }

}