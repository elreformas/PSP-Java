package hilos03;

import java.util.ArrayList;

public class hiloEscritor implements Runnable {
	
	ArrayList<String> lista;
	String producto;

	public hiloEscritor(String p, ArrayList<String> lista) {
		
		this.producto = p;
		this.lista = lista;
		
	}

	@Override
	public void run() {
		
		synchronized(lista) {
			
			lista.add(producto);
		}
		

	}

}
