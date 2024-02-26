package fp.tipos.musica;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Objects;

public class Cancion {
	
	private String titulo;
	private String artista;
	private Duration duracion;
	private LocalDate fechaLanzamiento;
	private Genero genero;
	
	// C1 (Constructor)
	public Cancion(String titulo, 
				   String artista) {
		
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = Duration.ZERO;
		this.fechaLanzamiento = null;
		this.genero = null;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getArtista() {
		return artista;
	}
	
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public Duration getDuracion() {
		return duracion;
	}
	
	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}
	
	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	
	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	public Genero getGenero() {
		return genero;
	}
	
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getFormatoCorto() {
		
		return getTitulo ()+ "(" 
			 + getArtista() + ")" 
			 + durACadena(getDuracion());
	}
	
	private String durACadena(Duration duracion) {
		
		Long minutos = duracion.toMinutes();
		//Long segundos = duracion.toSeconds()-minutos*60;		
		Integer segundos = duracion.toSecondsPart();
		return minutos+":"+segundos;
	}
	
	public String toString() {
		return "Cancion [getTitulo()=" + getTitulo() + 
			   ", getArtista()=" + getArtista() + 
			   ", getDuracion()=" + getDuracion() + 
			   ", getFechaLanzamiento()=" + getFechaLanzamiento() + 
			   ", getGenero()=" + getGenero() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(artista, duracion, fechaLanzamiento, genero, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Objects.equals(artista, other.artista) && Objects.equals(duracion, other.duracion)
				&& Objects.equals(fechaLanzamiento, other.fechaLanzamiento) && genero == other.genero
				&& Objects.equals(titulo, other.titulo);
	}
}