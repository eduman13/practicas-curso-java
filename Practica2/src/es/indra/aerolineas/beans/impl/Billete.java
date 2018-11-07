package es.indra.aerolineas.beans.impl;

public class Billete {

	private int id;
	private String fecha;
	private int asiento;
	private Vuelo vuelo;
	private Pasajero pasajero;

	public Billete() {

	}

	public Billete(int id, String fecha, int asiento, Vuelo vuelo, Pasajero pasajero) {
		this.id = id;
		this.fecha = fecha;
		this.asiento = asiento;
		this.vuelo = vuelo;
		this.pasajero = pasajero;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

}
