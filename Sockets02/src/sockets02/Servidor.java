package sockets02;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) throws IOException {
	
		ServerSocket servSocket = new ServerSocket(5252);
		Socket socket = servSocket.accept();
		
		DataInputStream entrada = new DataInputStream(socket.getInputStream());
		
		while(true) {
			
			System.out.println(entrada.readUTF());
			
		}
	}
}
