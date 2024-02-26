package fp.tipos.futbol;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public record PartidoFutbol(LocalDateTime fecha, 
							String equipoLocal, 
							String equipoVisitante, 
							Integer golesLocal,
							Integer golesVisitante) {

	public Resultado getResultado() {
	
		Resultado r = Resultado.UNO;
		
		if (golesLocal() == golesVisitante()) {
			r = Resultado.EQUIS;
		} else if (golesLocal() < golesVisitante()) {
			r = Resultado.DOS;
		}
		return r;
	}

	public String getCadenaFormato() {
		return formatearFecha(fecha()) + "-> " + equipoLocal() 
									   + " vs " + equipoVisitante() 
									   + ":" + golesLocal() 
									   + "-" + golesVisitante() 
									   + " (" + formatearResultado(getResultado()) + ")";
	}

	private String formatearResultado(Resultado resultado) {

		String res = null;
		
		switch (resultado) {
		case UNO:
			res = "1";
			break;
		case EQUIS:
			res = "X";
			break;
		case DOS:
			res = "2";
		}
		return res;
	}

	private String formatearFecha(LocalDateTime fecha) {
		return fecha.format(DateTimeFormatter.ofPattern("dd-MM-yy"));
	}
}