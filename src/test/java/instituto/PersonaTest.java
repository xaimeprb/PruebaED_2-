package instituto;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testGetEdad() {

		// Creamos una persona con la fecha de nacimiento fija
		Persona persona = new Persona(87654321, "María García", 'F', 1, 1, 2000);
		int edad = persona.getEdad();
		
		// Calculamos la edad esperada
		int anioActual = LocalDate.now().getYear();
		int edadEsperada = anioActual - 2000;
		
		// Permitir una diferencia en caso de que no haya pasado el cumpleaños
		assertTrue(edad == edadEsperada || edad == edadEsperada -1, "La edad calculada no es la esperada");
	
	}

}
