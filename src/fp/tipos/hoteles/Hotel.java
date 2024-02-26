package fp.tipos.hoteles;

import fp.tipos.common.Coordenada;

public record Hotel(String nombre, 
				    String direccion, 
				    String ciudad, 
				    String telefono, 
				    String cadenaHotelera, 
				    String descripcion, 
				    CategoriaHotelera categoriaHotelera, 
				    TipoAlojamiento tipoAlojamiento, 
				    CategoriaPrecio categoriaPrecio, 
				    Float puntuacion,
				    Integer numeroComentarios, 
				    Boolean admiteMascotas, 
				    Boolean estaAdaptado, 
				    Coordenada coordenadas) {
	
	// C2 (Construtor)
	public Hotel(String nombre, 
				 String direccion, 
				 String ciudad, 
				 String telefono,
				 String cadenaHotelera, 
				 CategoriaHotelera categoria) {
		
		this(nombre,
			 direccion, 
			 ciudad, 
			 telefono, 
			 cadenaHotelera, 
			 null, 
			 categoria, 
			 null,
			 CategoriaPrecio.MEDIA, 
			 null,
			 0, 
			 false, 
			 false, 
			 null );
	}

	// C3 (Construtor)
	public Hotel(String nombre, 
				 String cadenaHotelera, 
				 CategoriaHotelera categoria) {
		this(nombre,
			 null, 
			 null, 
			 null, 
			 cadenaHotelera, 
			 categoria);
	}

	public String cadenaFormato() {
		return String.format("%s (%s)", nombre(), catogeriaACadena(categoriaHotelera(), tipoAlojamiento()));
	}

	private String catogeriaACadena(CategoriaHotelera categoriaHotelera, TipoAlojamiento tipoAlojamiento) {
		
		String res = "N/A";
		
		if (tipoAlojamiento!= null && tipoAlojamiento.equals(TipoAlojamiento.HOTEL)) {
			res = calcularEstrellas(categoriaHotelera);
		}
		return res;
	}

	private String calcularEstrellas(CategoriaHotelera categoriaHotelera) {
		String res ="";
		switch (categoriaHotelera) {
		case CINCO:
			res="*****";
			break;
		case CUATRO:
			res="****";
			break;
		case TRES:
			res="***";
			break;
		case DOS:
			res="**";
			break;
		case UNA:
			res="*";
			break;
		}
		return res;
	}
}