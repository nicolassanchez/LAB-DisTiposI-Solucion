package fp.tipos.common;

import java.time.LocalDate;

public record Persona(String nombre, String apellidos, String dni, LocalDate fechaNacimiento) {

	public Integer getEdad() {
		 
		return fechaNacimiento().until(LocalDate.now()).getYears();				
	}
}