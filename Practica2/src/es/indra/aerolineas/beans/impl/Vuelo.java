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

	protected int id;
	protected String origen;
	protected String destino;
	protected String fecha;

	public Vuelo() {
	}

	public Vuelo(int id, String origen, String destino, String fecha) {
		super();
		this.id = id;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	

}
