/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.Iterator;
import java.util.List;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.services.ReadFile;

/**
 * @author josejarizav
 *
 *
 */
public class Aerolinea implements IAerolinea {

	private int id;
	private String nombre;
	private Vuelo[] vuelos = new Vuelo[10];

	public Aerolinea() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, Vuelo[] vuelos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelos = vuelos;
	}

	public Vuelo[] consultarVuelos(String origen) {
		
		return this.vuelos;
	}

	public Vuelo[] consultarVuelos(String origen, String destino) {
		return this.vuelos;
	}

	public void anularVuelos(String... vuelos) {
		System.out.println("Número de vuelos a anular: " + vuelos.length);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Vuelo[] getVuelos() {
		return vuelos;
	}

	public void setVuelos(Vuelo[] vuelos) {
		this.vuelos = vuelos;
	}
	
	public void consultarVuelos() {
		ReadFile file = new ReadFile();
		List<String> imprimir = file.retornarVuelos();
		Iterator<String> it = imprimir.iterator();
		while(it.hasNext()){
			String elemento = it.next();
			System.out.println(elemento);
		}
		
	}

}
