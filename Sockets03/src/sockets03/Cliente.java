package sockets03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
	
		Socket socket;
			
			socket = new Socket("192.168.102.200", 5454);
			System.out.println("Puerto local: " + socket.getLocalPort());
			System.out.println("Puerto remoto: " + socket.getPort());
			System.out.println("IP remota: " + socket.getInetAddress());
			
			Thread clienteReceptor = new Thread(new ClienteReceptor(new DataInputStream(socket.getInputStream())));
			Scanner teclado = new Scanner(System.in);
			
			
			String linea = teclado.nextLine();
			
			DataOutputStream salida  = new DataOutputStream(socket.getOutputStream());
			
			while (!linea.equals("quit")) {
				
				salida.writeUTF(linea);
				linea = teclado.nextLine();
				
			}
			
			salida.writeUTF(linea);
			salida.close();
			socket.close();
			System.out.println("Conexión finalizada.");


	}

}
