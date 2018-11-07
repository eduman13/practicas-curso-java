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
	private List<Vuelo> vuelosDisponibles = new ArrayList<Vuelo>();
	private List<Billete> billetesDisponibles = new ArrayList<Billete>();
	
	public Aerolinea() {
	}

	/**
	 * @param id
	 * @param nombre
	 * @param vuelos
	 */
	public Aerolinea(int id, String nombre, List<Vuelo> vuelosDisponibles, List<Billete> billetesDisponibles) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vuelosDisponibles = vuelosDisponibles;
		this.billetesDisponibles = billetesDisponibles;
	}

//	public List<Vuelo> consultarVuelos(String origen) {
//
//		return this.vuelosDisponibles;
//	}

//	public Vuelo[] consultarVuelos(String origen, String destino) {
//		return this.vuelos;
//	}

//	public void anularVuelos(String... vuelos) {
//		System.out.println("Número de vuelos a anular: " + vuelos.length);
//	}

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

	public List<Vuelo> getVuelos() {
		return vuelosDisponibles;
	}

	public List<Billete> getBilletesDisponibles() {
		return billetesDisponibles;
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

	public void publicarVuelos(Vuelo vuelo) {
		vuelosDisponibles.add(vuelo);
		int asiento = (int) Math.floor(Math.random() * 6 + 1);
		Billete billete = new Billete(vuelo.getId(), vuelo.getOrigen(), vuelo.getDestino(), 
				vuelo.getFecha(), asiento);		
		billetesDisponibles.add(billete);

	}

	public List<Billete> verBilletePorFecha(String fecha) {
		List<Billete> billeteFecha = new ArrayList<Billete>();
		for(Billete billete: billetesDisponibles) {
			if(billete.getFecha().equals(fecha)) {
				billeteFecha.add(billete);
			}
		}
		return billeteFecha;
	}

}
