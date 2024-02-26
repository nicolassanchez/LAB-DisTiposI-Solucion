package fp.tipos.hoteles.test;

import fp.tipos.common.Coordenada;
import fp.tipos.hoteles.CategoriaHotelera;
import fp.tipos.hoteles.CategoriaPrecio;
import fp.tipos.hoteles.Hotel;
import fp.tipos.hoteles.TipoAlojamiento;

public class TestHotel {

	public static void main(String[] args) {
		
		Hotel h1 = new Hotel("Hotel Doña María", 
							 "Sin cadena", 
							 CategoriaHotelera.CUATRO);
		mostrarHotel(h1);
		
		Hotel h2 = new Hotel("Hotel Alfonso XIII", 
							 "c/San Fernando, 2", 
							 "Sevilla", 
							 "954111111", 
							 "Mariott", 
							 CategoriaHotelera.CINCO);
		mostrarHotel(h2);
		
		Coordenada coord = new Coordenada (37.40156915528306, -5.985875096300111);
		Hotel h3 = new Hotel("Hostal La Muralla", 
							 "Fray Diego de Cádiz, 39",
							 "Sevilla", 
							 "954222222", 
							 "Seville Hotel Resorts", 
							 "Cerca del barrio Macarena, Alojamiento tradicional",
							 CategoriaHotelera.UNA, 
							 TipoAlojamiento.PENSION, 
							 CategoriaPrecio.MEDIA, 
							 7.7f, 
							 10, 
							 false, 
							 true, 
							 coord);
		mostrarHotel(h3);
	}

	private static void mostrarHotel(Hotel h) {
		System.out.println("Nombre: "+ h.nombre());
		System.out.println("Direccion: "+ h.direccion());
		System.out.println("Ciudad: "+ h.ciudad());
		System.out.println("Telefono: "+ h.telefono());
		System.out.println("Cadena Hotelera: "+ h.cadenaHotelera());
		System.out.println("Descripcion: "+ h.descripcion());
		System.out.println("Categoria: "+ h.categoriaHotelera());
		System.out.println("Tipo Alojamiento: "+ h.tipoAlojamiento());
		System.out.println("Categoria Precio: "+ h.categoriaPrecio());
		System.out.println("Puntuacion: "+ h.puntuacion());
		System.out.println("Num. comentarios: "+ h.numeroComentarios());
		System.out.println("Admite mascotas: "+ h.admiteMascotas());
		System.out.println("Adaptado?: "+ h.estaAdaptado());
		System.out.println("Coordenadas: "+ h.coordenadas());
		System.out.println("Formato: "+ h.cadenaFormato());
	}
}