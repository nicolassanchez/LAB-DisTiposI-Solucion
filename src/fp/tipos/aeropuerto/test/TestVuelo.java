package fp.tipos.aeropuerto.test;

import java.time.LocalDateTime;

import fp.tipos.aeropuerto.Vuelo;
import java.time.format.DateTimeFormatter;

/**
 * @author reinaqu
 *
 */
public class TestVuelo {

	private static void muestraVuelo(Vuelo vuelo) {
		System.out.println("Datos del vuelo " + vuelo);
		System.out.println("==========================================\n");
		System.out.println("Cod.: " + vuelo.getCodigo());
		System.out.println("Origen: " + vuelo.getOrigen());
		System.out.println("Destino: " + vuelo.getDestino());
		System.out.println(
				"Fecha de salida: " + vuelo.getFechaSalida().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm")));
		System.out.println("Num. plazas: " + vuelo.getNumeroPlazas());
		System.out.println("Num. pasajeros: " + vuelo.getNumeroPasajeros());

		if (! vuelo.estaCompleto()) {
			System.out.println( "\nVuelo completo?: NO" ); 
		} 
		else 
		{
			System.out.println( "\nVuelo completo?: SI" );
		}
		
		System.out.println("\nCadena con formato: " + vuelo.cadenaFormato());
	}

	private static void testConstructorC1(String codigo, String origen, String destino, LocalDateTime fechaSalida,
			Integer numeroPlazas, Integer numeroPasajeros) {
		Vuelo v = new Vuelo(codigo, origen, destino, fechaSalida, numeroPlazas, numeroPasajeros);
		muestraVuelo(v);
	}
	
	public static void main(String[] args) {

		testConstructorC1("IB5034", "Sevilla", "Madrid", LocalDateTime.of(2016, 12, 25, 17, 25), 200, 150);
	}
}