package hilos04;

public class hiloInsertador implements Runnable {

	ListaCompra lista;
	String producto;
	
	public hiloInsertador(ListaCompra lista, String producto) {
		
		super();
		this.lista = lista;
		this.producto = producto;
	}

	@Override
	public void run() {
		
		try {
			
			Thread.sleep(500);
		} 
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		lista.anadirProducto(producto);

	}
	
	

}
