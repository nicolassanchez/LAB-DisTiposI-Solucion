package fp.tipos.cine.test;

import java.time.LocalDate;

import fp.tipos.cine.Pelicula;

public class TestPelicula {

	public static void mostrarPelicula(Pelicula p) {
		System.out.println("T�tulo: "+ p.getTitulo());
		System.out.println("Fecha Estreno: "+p.getFechaEstreno());
		System.out.println("Duracion: "+p.getDuracion());
		System.out.println("Tipo: "+p.getTipoMetraje());
		System.out.println("Formato Corto: "+p.getFormatoCorto());
		System.out.println(p);
	}

	public static void main(String[] args) {
		Pelicula p1 = new Pelicula("El buen patr�n",LocalDate.of(2021, 10, 15), 120);
		mostrarPelicula(p1);
		System.out.println("=======================");
		Pelicula p2 = new Pelicula("Maixabel");
		mostrarPelicula(p2);
		System.out.println("=======================");		
		p2.setDuracion(90);
		p2.setFechaEstreno(LocalDate.of(2021, 9, 24));
		mostrarPelicula(p2);
		System.out.println("=======================");

	}

}
