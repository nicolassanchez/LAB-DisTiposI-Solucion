package fp.tipos.universidad;

public class Beca {

	// Constantes
	private static final Double CUANTIA_MINIMA = 1500.0;
	private static final Integer DURACION_MINIMA = 1;

	// Atributos
	private String codigo;
	private Double cuantiaTotal;
	private Integer duracion;
	private TipoBeca tipo;
	
	public Beca(String codigo, 
			    Double cuantiaTotal, 
			    Integer duracion, 
			    TipoBeca tipo) {
		
		this.codigo = codigo;
		setCuantiaTotal(cuantiaTotal);
		setDuracion(duracion);
		this.tipo = tipo;
	}
	
	public Beca(String codigo,  TipoBeca tipo) {
		this(codigo, 
			 CUANTIA_MINIMA, 
			 DURACION_MINIMA, 
			 tipo);
	}

	public Double getCuantiaTotal() {
		return cuantiaTotal;
	}
	
	public void setCuantiaTotal(Double cuantiaTotal) {
		this.cuantiaTotal = cuantiaTotal;
	}

	public Integer getDuracion() {
		return duracion;
	}
	
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public TipoBeca getTipo() {
		return tipo;
	}
		
	public Double getCuantiaMensual() {
		return getCuantiaTotal()/getDuracion();
	}
		
	public String formatoCadena() {
	
		String strTipo= getTipo().toString().toLowerCase();
		return String.format("[%s, %s]", getCodigo(), strTipo);
	}

	@Override
	public String toString() {
		return "Beca [getCuantiaTotal()=" + getCuantiaTotal() + 
			   ", getDuracion()=" + getDuracion() + 
			   ", getCodigo()=" + getCodigo() + 
			   ", getTipo()=" + getTipo() + 
			   ", getCuantiaMensual()=" + getCuantiaMensual() + 
			   ", formatoCadena()=" + formatoCadena() + "]";
	}
}