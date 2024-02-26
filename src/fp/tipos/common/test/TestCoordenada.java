package fp.tipos.common.test;

import fp.tipos.common.Coordenada;

public class TestCoordenada {

	public static void main(String[] args) {
		Coordenada c = new Coordenada(13.456, -1.4560);
		Coordenada c2 = new Coordenada(-13.456, 1.4560);
		mostrarCoordenada(c);
		testDistancia (c, c2);
		testDistanciaHaversine (c, c2);
	}

	private static void testDistanciaHaversine(Coordenada c, Coordenada c2) {
		Double d = c.getDistanciaHaversine(c2);
		System.out.println("La distancia de " + c + " y " + c2 + " es " + d);
		
	}

	private static void testDistancia(Coordenada c, Coordenada c2) {
		Double d = c.getDistancia(c2);
		System.out.println("La distancia de " + c + " y " + c2 + " es " + d);
	}

	private static void mostrarCoordenada(Coordenada c) {
		System.out.println("Latitud: " + c.latitud());
		System.out.println("Longitud: " + c.longitud());
		System.out.println("Latitud (en radianes): " + c.latitudRadianes());
		System.out.println("Longitud (en radianes): " + c.longitudRadianes());
		System.out.println(c);
	}

}
