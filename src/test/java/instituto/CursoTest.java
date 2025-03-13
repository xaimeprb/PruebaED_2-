package instituto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void testAniadirAlumno() {
		
		Curso curso = new Curso("Programación");
		Persona alumno = new Persona(12345678, "Juan Pérez", 'M', 15, 6, 1995);
		curso.aniadirAlumno(alumno);
		
		// Verificamos que al menos el nombre del alumno se encuentra en el resultado de el toString()
		String salida = curso.toString();
		assertTrue(salida.contains("Juan"), "El alumno deberia estar en la lista tras aniadirlo");
	}

}
