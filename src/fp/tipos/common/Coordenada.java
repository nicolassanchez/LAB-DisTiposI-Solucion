package fp.tipos.common;

public record Coordenada (Double latitud, Double longitud){

	// Constante
	private static final Double RADIO_TIERRA =  6371.0;
	
	public Double getDistancia(Coordenada c) {
		Double difLat = c.latitud()-latitud();
	    Double difLon = c.longitud()-longitud();
		return Math.sqrt(difLat*difLat + difLon*difLon);
	}
		
	public Double latitudRadianes() {
		return Math.toRadians(latitud());
	}
	
	public Double longitudRadianes() {
		return Math.toRadians(latitud());
	}
	
	public Double getDistanciaHaversine(Coordenada c) {
		Double difLat = Math.toRadians(c.latitud()-latitud());
	    Double difLon = Math.toRadians(c.longitud()-longitud());
	    Double a = Math.pow(Math.sin(difLat/2),2) +
	    		   Math.cos(latitudRadianes()) * Math.cos(c.latitudRadianes()) *
	    		   Math.pow(Math.sin(difLon/2),2);
	    Double calc = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	    return RADIO_TIERRA*calc;
	}
}