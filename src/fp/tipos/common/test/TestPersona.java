package fp.tipos.common.test;

import java.time.LocalDate;

import fp.tipos.common.Persona;

public class TestPersona {

	public static void main(String[] args) {

		Persona p = new Persona("Jane", "Doe", "12345678Y", LocalDate.of(2000, 01, 01));
		mostrarPersona(p);
		
	}

	private static void mostrarPersona(Persona p) {
		System.out.println("Nombre:"+p.nombre());
		System.out.println("Apellidos:"+p.apellidos());
		System.out.println("DNI:"+p.dni());
		System.out.println("Fecha nacimiento:"+p.fechaNacimiento());
		System.out.println("Edad:"+p.getEdad());
		System.out.println(p);
	}

}
