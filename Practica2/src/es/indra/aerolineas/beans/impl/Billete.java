package es.indra.aerolineas.beans.impl;

public class Billete extends Vuelo {

	private int asiento;
	private Pasajero pasajero;

	public Billete() {

	}

	public Billete(int id, String origen, String destino,
			String fecha, int asiento) {
		super(id, origen, destino, fecha);
		this.asiento = asiento;
		
	}
	
	public int getAsiento() {
		return asiento;
	}

	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

}
