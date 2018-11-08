/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.indra.aerolineas.beans.exceptions.ErrorLecturaDeVuelosException;
import es.indra.aerolineas.beans.impl.Pasajero;

/**
 * @author aula3
 *
 */

public class ReadFile {

	public List<String> retornarVuelos() throws ErrorLecturaDeVuelosException {
		Path path = Paths.get("C:\\Users\\aula1\\repositorios\\CursoJava\\practicas-curso-java\\vuelos.txt");
		List<String> contenido = new ArrayList<>();
		try {
			contenido = Files.readAllLines(path);
			return contenido;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new ErrorLecturaDeVuelosException("Fallo leyendo el archivo", e);
			// System.out.println("No existe el fichero");
		}

	}

	public ReadFile() {
		// TODO Auto-generated constructor stub
	}

	public void WriteFile(List<Pasajero> pasajerosImprimir) {

		FileWriter fichero = null;
		PrintWriter pw = null;

		try {
			fichero = new FileWriter("C:\\Users\\aula1\\repositorios\\CursoJava\\practicas-curso-java\\pasajeros.txt");
			pw = new PrintWriter(fichero);

			for (Pasajero pasajero : pasajerosImprimir) {
				pw.println(pasajero.getId() + ";" + pasajero.getNombre() + ";" + pasajero.getApellido() + ";"
						+ pasajero.getDni());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != fichero)
				try {
					fichero.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
