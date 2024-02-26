package fp.tipos.aeropuerto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author reinaqu  
 */

public class Vuelo {

	// Atributos
	private String codigo;
	private String origen;
	private String destino;
	private LocalDateTime fechaSalida;
	private Integer numeroPlazas;
	private Integer numeroPasajeros;
	
	public Vuelo(String codigo, 
				 String origen, 
				 String destino, 
				 LocalDateTime fechaSalida, 
				 Integer numeroPlazas,
				 Integer numeroPasajeros) {
		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.numeroPlazas = numeroPlazas;
		this.numeroPasajeros = numeroPasajeros;
	}
	
	public Vuelo(String codigo, 
				 String origen, 
				 String destino, 
				 LocalDateTime fechaSalida, 
				 Integer numeroPlazas) {
		
		this(codigo, 
			 origen, 
			 destino, 
			 fechaSalida, 
			 numeroPlazas, 
			 0);
	}

	// M…todos getter / setter 
	
	public LocalDateTime getFechaSalida() {
		return fechaSalida;
	}
	
	public void setFechaSalida(LocalDateTime fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	
	public Integer getNumeroPasajeros() {
		return numeroPasajeros;
	}

	
	public void setNumeroPasajeros(Integer numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getOrigen() {
		return origen;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public Integer getNumeroPlazas() {
		return numeroPlazas;
	}
		
	// Otros m√©todos
	
	public Boolean estaCompleto() {
		return getNumeroPlazas().equals(getNumeroPasajeros());
	}
	
	public String cadenaFormato() {
		String strFecha = getFechaSalida().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		return String.format("(%s) %s-%s %s", getCodigo(), getOrigen(), getDestino(), strFecha);
	}

	@Override
	public String toString() {
		return "Vuelo [getFechaSalida()=" + getFechaSalida() + ", getNumeroPasajeros()=" + getNumeroPasajeros()
				+ ", getCodigo()=" + getCodigo() + ", getOrigen()=" + getOrigen() + ", getDestino()=" + getDestino()
				+ ", getNumeroPlazas()=" + getNumeroPlazas() + ", estaCompleto()=" + estaCompleto()
				+ ", cadenaFormato()=" + cadenaFormato() + "]";
	}
}