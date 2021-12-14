package sockets01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			
			Socket client = new Socket("localhost", 5252);
			DataInputStream entrada = new DataInputStream (client.getInputStream());
			
			System.out.println(entrada.readUTF());
			
			DataOutputStream salida = new DataOutputStream(client.getOutputStream());
			
			salida.writeUTF("OeeeeeeeEEEEEEEEEEEEeeeeeeeeeeeEEEEEEEEEEEEEEeeeeeeeeeeeee");
		} 
		
		catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
