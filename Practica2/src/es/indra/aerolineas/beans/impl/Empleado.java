package es.indra.aerolineas.beans.impl;

public class Empleado extends Persona {

	public Empleado() {}
	
	@Override
	public String getNombre() {
		return nombre;
	}
	
	public String solicitarInformacion() {
		return "";
	}
}
