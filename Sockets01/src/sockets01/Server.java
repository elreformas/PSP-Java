package sockets01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		try {
			
			ServerSocket server = new ServerSocket(5252);
			Socket client = server.accept();
			
			System.out.println(client.getInetAddress().toString());
			
			DataOutputStream salida = new DataOutputStream(client.getOutputStream());
			
			salida.writeUTF("EOoooooooooooooooooooOOOOOOOOOOOOOOOOOOooooooooooooooooooooooOOOOO");
			
			DataInputStream entrada = new DataInputStream(client.getInputStream());
			
			System.out.println(entrada.readUTF());
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
