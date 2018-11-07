/**
 * 
 */
package es.indra.aerolineas.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import es.indra.aerolineas.beans.exceptions.ErrorLecturaDeVuelosException;

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

}
