package org.bedu.jse.sesion7.Ejemplo1;

import org.bedu.jse.sesion7.Ejemplo1.persistence.CalculadoraDao;
import org.bedu.jse.sesion7.Ejemplo1.services.CalculadoraService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
@SpringBootTest

class CalculadoraServiceTest {

	@Mock
	CalculadoraDao calculadoraDao;
	@InjectMocks
	private CalculadoraService calculadora;

	@BeforeEach
	void setUp(){
		given(calculadoraDao.findValorConstante()).willReturn(3);
	}

	@Test
	@DisplayName("Prueba suma")
	void sumaTest() {
		int esperado = 8;
		assertEquals(esperado, calculadora.suma(3, 2));
	}

	@Test
	@DisplayName("Prueba resta")
	void restaTest() {
		int esperado = 4;
		assertEquals(esperado, calculadora.resta(3, 2));
	}
	@Test
	@DisplayName("Prueba multiplicación")
	void multiplicaTest() {
		int esperado = 9;
		assertEquals(esperado, calculadora.multiplica(3, 2));
	}

}
