package sockets03;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class HiloConexion extends Thread {

	Socket socket;
	
	public HiloConexion(Socket socket) {
		super();
		this.socket = socket;
	}


	@Override
	public void run() {
		
		System.out.println("Conexion del cliente con dirección: " + socket.getInetAddress());
		
		System.out.println("Puerto local: " + socket.getLocalPort());
		System.out.println("Puerto remoto: " + socket.getPort());
		System.out.println("IP remota: " + socket.getInetAddress());
		
		DataInputStream entrada = null;
		
		try {
			entrada = new DataInputStream(socket.getInputStream());
		} 
		
		catch (IOException e) {
			
			System.err.println("Error obteniendo el stream del socket.");
			e.printStackTrace();
		}
		
		String mensaje = null;
		
		try {
			mensaje = entrada.readUTF();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (!mensaje.equals("quit")) {
			
			System.out.println("[" + socket.getInetAddress() + "]: " + mensaje);
		}
		
		System.out.println("El cliente quiere salir.");
		
		try {
			
			entrada.close();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			socket.close();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
