package hilos03;

import java.util.ArrayList;

public class Principal {
	
	public static Thread insertarProducto(String p, ArrayList<String> lista) {
		
		Thread h = new Thread(new hiloEscritor(p, lista));
		h.start();
		return h;
	}

	public static void main(String[] args) {
		
		ArrayList<String> listaCompra = new ArrayList<String>();
		ArrayList<Thread> listaEscritores = new ArrayList<Thread>();
		
		listaEscritores.add(insertarProducto("Manzanas", listaCompra));
		listaEscritores.add(insertarProducto("Patatas", listaCompra));
		listaEscritores.add(insertarProducto("Entrecot", listaCompra));
		listaEscritores.add(insertarProducto("Perejil", listaCompra));
		
		for (Thread hilo : listaEscritores) {
			
			try {
				hilo.join();
			} 
			
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		synchronized(listaCompra) {
			
			System.out.println(listaCompra);
		}
		

	}

}
