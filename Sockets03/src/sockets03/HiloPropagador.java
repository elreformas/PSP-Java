package sockets03;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class HiloPropagador implements Runnable {

	ArrayList<Socket> listado;
	ColaMensajes colaMensajes;
	
	public HiloPropagador(ArrayList<Socket> lista, ColaMensajes cola) {
		super();
		this.listado = lista;
		this.colaMensajes = cola;
	}

	@Override
	public void run() {
		
		while(true) {
			
			synchronized (colaMensajes) {
				
				try {
					colaMensajes.wait();
				} 
				
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
			Mensajes m = colaMensajes.obtenerMensaje();
			
			for (Socket socket : listado) {
				
				DataOutputStream salida = null;
				
				try {
					
					salida = new DataOutputStream(socket.getOutputStream());
				} 
				
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					
					salida.writeUTF(m.toString());
				} 
				
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
