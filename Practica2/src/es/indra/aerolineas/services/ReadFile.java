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

/**
 * @author aula3
 *
 */
public class ReadFile {

	public List<String> retornarVuelos() {
		Path path = Paths.get("C:\\Users\\aula1\\repositorios\\CursoJava\\practicas-curso-java\\vuelos.txt");
		List<String> contenido = new ArrayList<>();
		try {
			contenido = Files.readAllLines(path);
			//System.out.println(contenido);
			return contenido;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// System.out.println("No existe el fichero");
		}
		return contenido;

	}

	public static void main(String[] args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}
}
