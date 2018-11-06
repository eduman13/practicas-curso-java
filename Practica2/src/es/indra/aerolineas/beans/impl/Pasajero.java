/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {
	
	
	private int id;
	private Vuelo[] vuelos;
	
	
	/**
	 * @param id
	 * @param vuelos
	 */
	
	public Pasajero() {}
	
	public Pasajero(int id, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.vuelos = vuelos;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellidos) {
		this.apellido = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String solicitarInformacion() {
		return "";
	}

}
