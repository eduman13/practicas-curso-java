package es.indra.aerolineas.beans;

import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolinea {
	
	void anularVuelos(String... vuelos);
	public Vuelo[] consultarVuelos(String origen);
	public Vuelo[] consultarVuelos(String origen, String destino);

}
