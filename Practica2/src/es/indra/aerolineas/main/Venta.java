/**
 * 
 */
package es.indra.aerolineas.main;

import java.util.ArrayList;
import java.util.List;

import es.indra.aerolineas.beans.IAerolinea;
import es.indra.aerolineas.beans.impl.Aerolinea;
import es.indra.aerolineas.beans.impl.Billete;
import es.indra.aerolineas.beans.impl.Empleado;
import es.indra.aerolineas.beans.impl.Pasajero;
import es.indra.aerolineas.beans.impl.Vuelo;

/**
 * @author josejarizav
 *
 */
public class Venta {

//	private static Vuelo[] creaVuelos() {
//		Vuelo[] vuelos = new Vuelo[10];
//		for (int i = 0; i < vuelos.length; i++) {
//			int a = (int) (Math.random() * 10 + 1);
//			vuelos[i] = new Vuelo(i, "SD" + a, "MAD", "VLC", i * 10, true);
//		}
//		return vuelos;
//	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		Vuelo[] vuelos = creaVuelos();

//		IAerolinea aa = new Aerolinea(10, "American Airlines", vuelos);
//
//		Pasajero p = new Pasajero();
//
//		Empleado emp = new Empleado();
//		emp.setNombre("Vendedor 1");

//		Vuelo[] vuelosPasajero = { vuelos[0], vuelos[4] };

//		p.setId(10);
//		p.setNombre("Jose Julian");
//		p.setApellido("Ariza Valderrama");
//		p.setVuelos(vuelosPasajero);
//		aa.consultarVuelos();

//		System.out.println("*************************************************************************");
//
//		System.out.println("|\tBienvenidos a aerolineas ".concat(aa.getNombre()));
//
//		System.out.printf("|\tTenemos %s vuelos disponibles%n", aa.getVuelos().length);
//
//		System.out.printf("|\t%s, gracias por confiar en nosotros. Tienes %s vuelos comprados %n", p.getNombre(),
//				p.getVuelos().length);
//
//		System.out.println("*************************************************************************");

		// System.out.println(emp.getNombre());
		// System.out.println(p.getNombre());
		Vuelo vuelo1 = new Vuelo(1234, "MAD", "BCN", "2");
		Vuelo vuelo2 = new Vuelo(12345, "MAD", "BCN", "3");
		Pasajero pasajero1 = new Pasajero();
		Aerolinea iberia = new Aerolinea(1, "Iberia");
		iberia.publicarVuelos(vuelo1);
		iberia.publicarVuelos(vuelo2);
		pasajero1.buscarBilletes(iberia, "MAD", "BCN");
		pasajero1.comprarBillete(iberia, pasajero1, 1234);
		pasajero1.comprarBillete(iberia, pasajero1, 1234);
		Aerolinea ryanair = new Aerolinea(2, "Ryanair");
		Vuelo vuelo3 = new Vuelo(123456, "BCN", "MAD", "3");
		ryanair.publicarVuelos(vuelo3);
		pasajero1.buscarBilletes(ryanair, "BCN", "MAD");
		System.out.println("Llega aqui");
		// pasajero1.comprarBillete(ryanair, pasajero1, 123456);
		Pasajero pasajero2 = new Pasajero();
		pasajero2.buscarBilletes(ryanair, "BCN", "MAD");
		pasajero2.comprarBillete(ryanair, pasajero2, 123456);
		pasajero2.comprarBillete(ryanair, pasajero2, 123456);
		pasajero2.comprarBillete(iberia, pasajero2, 1234);

	}

}
