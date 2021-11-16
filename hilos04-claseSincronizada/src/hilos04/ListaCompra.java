package hilos04;

import java.util.ArrayList;

public class ListaCompra {
	
	ArrayList<String> lista;

	public ListaCompra() {
		super();
		this.lista = new ArrayList<String>();
	}
	
	public synchronized void anadirProducto(String producto) {
		
		this.lista.add(producto);
		
	}
	
	public synchronized void extraerProducto(String producto) {
		
		boolean resultado = this.lista.remove(producto);
		
		if (!resultado) {
			
			System.out.println("[ListaCompra]: Advertencia, producto " + producto + " no encontrado.");
		}
	}

	@Override
	public synchronized String toString() {
		
		return "ListaCompra [lista=" + lista + "]";
	}
	
	

}
