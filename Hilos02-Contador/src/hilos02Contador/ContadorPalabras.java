package hilos02Contador;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorPalabras {

	public static void main(String[] args) {

		String rutaFichero = "/home/texto.txt";
		if (args.length > 0) {
			
			rutaFichero = args[0];
		}
		
		Scanner lector;
		try {
			lector = new Scanner(new File(rutaFichero));
			int contador = 0;

			while (lector.hasNext()) {

				lector.next();
				contador ++;
			}
			
			System.out.println("Total de palabras: " + contador + ".");
		} 
		
		catch (FileNotFoundException e) {
			
			System.out.println("Fichero " + rutaFichero + " no encontrado.");
		}
	}

}
