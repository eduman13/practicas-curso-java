/**
 * 
 */
package es.indra.aerolineas.services;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author aula3
 *
 */
public class ReadFile {

	public void retornarVuelos() {
		Path path = Paths.get("C:\\Users\\aula3\\repositorios\\CursoJava\\vuelo.txt");
		try {
			List<String> contenido = Files.readAllLines(path);
			System.out.println(contenido);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("No existe el fichero");
		}	
	}
	
	public static void main(String[] args) {
		ReadFile r = new ReadFile();
		r.retornarVuelos();
	}
}
