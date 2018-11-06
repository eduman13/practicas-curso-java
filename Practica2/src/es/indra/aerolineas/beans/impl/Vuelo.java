/**
 * 
 */
package es.indra.aerolineas.beans.impl;

/**
 * @author josejarizav
 *
 *
 */
public class Vuelo {

	private int id;
	private String numeroVuelo;
	private String origen;
	private String destino;
	private int numeroPasajeros;
	private boolean disponible;
	

	public Vuelo() {}
	
	public Vuelo(int id) {
		this.id = id;
	}

	public Vuelo(int id, String numeroVuelo, String origen, String destino, int numeroPasajeros, boolean disponible) {
		super();
		this.id = id;
		this.numeroVuelo = numeroVuelo;
		this.origen = origen;
		this.destino = destino;
		this.numeroPasajeros = numeroPasajeros;
		this.disponible = disponible;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}


}
