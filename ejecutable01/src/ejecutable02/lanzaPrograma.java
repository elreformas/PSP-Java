package ejecutable02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lanzaPrograma {

	public static void main(String[] args) throws IOException {
		
		Process proceso = Runtime.getRuntime().exec("ls");
		
		// conectamos un reader a la salida del proceso
		BufferedReader salida = new BufferedReader(new InputStreamReader(proceso.getInputStream()));
		
		
		// mientras haya datos a la salida, leer linea a linea e imprime por salida estandar
		while (salida.ready()) {
			
			System.out.println(salida.readLine());
			
		}
		

	}

}
