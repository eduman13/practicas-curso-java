package es.indra.aerolineas.beans;

import es.indra.aerolineas.beans.impl.Vuelo;

public interface IAerolinea {
	
	void anularVuelos(String... vuelos);
	public Vuelo[] consultarVuelos(String origen);
	public Vuelo[] consultarVuelos(String origen, String destino);
	public void consultarVuelos();
	public int getId();
	public void setId(int id);
	public String getNombre();
	public void setNombre(String nombre);
	public Vuelo[] getVuelos();
	public void setVuelos(Vuelo[] vuelos);

}
