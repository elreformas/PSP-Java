package hilos04;

public class Principal {

	public static void main(String[] args) {
		
		ListaCompra lista = new ListaCompra();
		
		new Thread(new hiloMonitor(lista)).start();
		synchronized (lista) {
				
			lista.notify();
		}
		
		new Thread(new hiloInsertador(lista, "Tomates")).start();
		new Thread(new hiloInsertador(lista, "Patatas")).start();
		new Thread(new hiloInsertador(lista, "Naranjas")).start();
		new Thread(new hiloInsertador(lista, "Atún")).start();
		new Thread(new hiloInsertador(lista, "Pasta")).start();
		
		try {
			Thread.sleep(2000);
		} 
		
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(lista);
		

	}

}
