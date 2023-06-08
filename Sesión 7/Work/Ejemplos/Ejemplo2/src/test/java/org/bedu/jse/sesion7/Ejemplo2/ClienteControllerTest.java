package org.bedu.jse.sesion7.Ejemplo2;

import org.bedu.jse.sesion7.Ejemplo2.controllers.ClienteController;
import org.bedu.jse.sesion7.Ejemplo2.model.Cliente;
import org.bedu.jse.sesion7.Ejemplo2.services.ClienteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static jdk.internal.jimage.ImageReaderFactory.get;
import static org.assertj.core.api.BDDAssumptions.given;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static sun.nio.cs.Surrogate.is;

@WebMvcTest(ClienteController.class)
@SpringBootTest
class ClienteControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ClienteService clienteService;

	@Test
	void obtenClienteTest() throws Exception {

		given(clienteService.obtenCliente(anyLong())).willReturn(Optional.of(Cliente.builder().id(1L).nombre("Nombre").correoContacto("cliente@contacto.com").build()));

		mockMvc.perform(get("/cliente/1")
						.content(MediaType.APPLICATION_JSON_VALUE))
				.andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.id", is(1)))
				.andExpect(jsonPath("$.correoContacto", is("cliente@contacto.com")))
				.andExpect(jsonPath("$.nombre", is("Nombre")));
	}
}
