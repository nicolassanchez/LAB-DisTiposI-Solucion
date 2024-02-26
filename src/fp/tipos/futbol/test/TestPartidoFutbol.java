package fp.tipos.futbol.test;

import java.time.LocalDateTime;

import fp.tipos.futbol.PartidoFutbol;

/**
 * @author Toñi Reina
 *
 */
public class TestPartidoFutbol {

	public static void main(String[] args) {
		
		PartidoFutbol p1 = new PartidoFutbol(LocalDateTime.now(), "Valencia CF", "Numancia", 2, 1);
		mostrarPartido(p1);
		
		PartidoFutbol p2 = new PartidoFutbol(LocalDateTime.now(), "Sevilla", "Betis", 2, 2);
		mostrarPartido(p2);
	    
		PartidoFutbol p3 = new PartidoFutbol(LocalDateTime.now(), "Ath. Madrid", "Celta", 1, 2);
	    mostrarPartido(p3);
	}

	private static void mostrarPartido(PartidoFutbol p) {
		System.out.println("Fecha:"+p.fecha());
		System.out.println("Equipo Local:"+p.equipoLocal());
		System.out.println("Equipo Visitante:"+p.equipoVisitante());
		System.out.println("Goles Local:"+p.golesLocal());
		System.out.println("Goles Visitante:"+p.golesVisitante());
		System.out.println("Resultado:"+p.getResultado());
		System.out.println("Formateado: " + p.getCadenaFormato());
		System.out.println(p);
	}
}