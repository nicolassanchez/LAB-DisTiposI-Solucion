package fp.tipos.cine;

import java.time.LocalDate;

/**
 * @author reinaqu
 *
 */
public class Pelicula {
	
	// Atributos
	private String titulo;
	private LocalDate fechaEstreno;
	private Integer duracion;

	// C1 (constructor)
	public Pelicula(String titulo, 
					LocalDate fechaEstreno, 
					Integer duracion) {
		
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.duracion = duracion;
	}

	// C2 (constructor)
	public Pelicula(String titulo) {

		this(titulo, 
			 null, 
			 null);
	}

	// Métodos getter / setter 
	
	public String getTitulo() {
		return titulo;
	}

	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}
	
	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	
	public Integer getDuracion() {
		return duracion;
	}

	public TipoMetraje getTipoMetraje() {

		TipoMetraje res = null;
		
		if (getDuracion() != null) {
			res = TipoMetraje.LARGOMETRAJE;
		
			if (getDuracion() < 30) {
				res = TipoMetraje.CORTOMETRAJE;
			
			} else if (getDuracion() >= 30 && getDuracion() <= 60) {
				res = TipoMetraje.MEDIOMETRAJE;
			}
		}
		return res;
	}

	public String getFormatoCorto() {
	
		String res = getTitulo();
		
		if (getFechaEstreno() != null) {
			res += " (" + getFechaEstreno().getYear() + ")";
		}
		return res;
	}

	@Override
	public String toString() {
		return "Pelicula [getTitulo()=" + getTitulo() + ", getFechaEstreno()=" + getFechaEstreno() + ", getDuracion()="
				+ getDuracion() + ", getTipoMetraje()=" + getTipoMetraje() + ", getFormatoCorto()=" + getFormatoCorto()
				+ "]";
	}

}
