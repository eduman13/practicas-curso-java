/**
 * 
 */
package es.indra.aerolineas.beans.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author josejarizav
 *
 *
 */
public class Pasajero extends Persona {

	private int id;
	private List<Billete> billetesComprados = new ArrayList<Billete>();

	/**
	 * @param id
	 * @param vuelos
	 */

	public Pasajero() {
		super();
	}

	public Pasajero(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Billete> getBilletesComprados() {
		return billetesComprados;
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

	public void buscarBilletes(Aerolinea aerolina, String origen, String destino) {
		for (Billete billete : aerolina.getBilletesDisponibles()) {
			if (billete.getOrigen().equals(origen) && billete.getDestino().equals(destino)) {
				System.out.println("id: " + billete.getId() + " Origen: " + billete.getOrigen() + " Destino: "
						+ billete.getDestino());
			}
		}

	}

	public void comprarBillete(Aerolinea aerolinea, Pasajero pasajero, int id) {
		if (!billetesComprados.isEmpty()) {
			for (Billete billete : billetesComprados) {
				if (billete.getId() == id) {
					System.out.println("Ya ha comprado este billete anteriormente");
				} else {
					for (Billete billeteComprar : aerolinea.getBilletesDisponibles()) {
						if (billeteComprar.getId() == id) {
							billetesComprados.add(billeteComprar);
							break;
						}
					}
				}
			}
		} else {
			for (Billete billeteComprar : aerolinea.getBilletesDisponibles()) {
				if (billeteComprar.getId() == id) {
					billetesComprados.add(billeteComprar);
					break;
				}
			}
		}
	}
}
