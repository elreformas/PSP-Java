package sockets03;

import java.util.ArrayList;

public class ColaMensajes {
	
	ArrayList<Mensajes> colaMensajes;

	public ColaMensajes() {
		
		colaMensajes = new ArrayList<Mensajes>();
	}
	
	public synchronized void anadirMensaje(String mensaje, String origen) {
		
		colaMensajes.add(new Mensajes(mensaje, origen));
	}
	
	public synchronized Mensajes obtenerMensaje() {
		
		Mensajes m = colaMensajes.get(0);
		colaMensajes.remove(0);
		return m;
	}
	
	

}
