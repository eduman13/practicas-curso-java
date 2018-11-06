/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author aula3
 *
 */
public abstract class Persona {
	
	
	protected String nombre;
	protected String apellido;
	protected String dni;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param dni
	 */
	public Persona() {}
	
	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellidos;
		this.dni = dni;
	}
	
	public abstract String solicitarInformacion();
	
	public String getNombre() {
		return nombre.toUpperCase();
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	

}
