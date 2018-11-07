/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.beans.exceptions.ErrorLecturaDeVuelosException;
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

	Map<Persona, Billete> billetesDisponibles = new HashMap<Persona, Billete>();

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
		List<String> vuelosEncontrados = new ArrayList<String>();
		try {
			vuelosEncontrados = file.retornarVuelos();
			if (!vuelosEncontrados.isEmpty() && vuelosEncontrados != null) {
				for (String elemento : vuelosEncontrados) {
					System.out.println(elemento);
				}
			} else {
				System.out.println("No se encontraron vuelos");
			}
		} catch (ErrorLecturaDeVuelosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Billete> verBilletePorFecha(String Fecha) {
		List<Billete> billetesPorFecha = new ArrayList<Billete>();
		for (Entry<Persona, Billete> billete : billetesDisponibles.entrySet()) {
			if (billete.getValue().getFecha().equals(Fecha)) {
				billetesPorFecha.add(billete.getValue());
			}

		}
		return billetesPorFecha;
	}

}
