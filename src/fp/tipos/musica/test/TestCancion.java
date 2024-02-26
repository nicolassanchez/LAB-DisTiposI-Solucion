package fp.tipos.musica.test;

import java.time.Duration;

import fp.tipos.musica.Cancion;
import fp.tipos.musica.Genero;

public class TestCancion {

	public static void mostrarCancion(Cancion cancion) {
		
		System.out.println("Artista: " + cancion.getArtista());
		System.out.println("Titulo: " + cancion.getTitulo());
		System.out.println("Duracion: " + cancion.getDuracion());
		System.out.println("Fecha lanzamiento: " + cancion.getFechaLanzamiento());
		System.out.println("Genero: " + cancion.getGenero());
		System.out.println("Formato Corto: " + cancion.getFormatoCorto());
		System.out.println(cancion);
	}

	public static void main(String[] args) {
	
		Cancion c1 = new Cancion("Whole Lotta Love ","Whole Lotta Love");
		mostrarCancion(c1);
		
		c1.setTitulo("Thriller");
		c1.setArtista("Michael Jackson");
		c1.setDuracion(Duration.ofSeconds(160));
		c1.setGenero(Genero.POP);
		System.out.println("Cancion tras el cambio: " + c1);
	}



}
