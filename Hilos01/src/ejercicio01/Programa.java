package ejercicio01;

public class Programa {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Soy el hilo principal y voy a lanzar la tarea.");
		System.out.println("");
		
		Tarea t1 = new Tarea();
		t1.start(); //lanzamos con estar aunque hayamos implementado run
		
		Thread t2 = new Thread(new TareaRunnable());
		t2.start();
		
		t2.join();
		t1.join();
		
		System.out.println("");
		System.out.println("Es es el final del hilo principal");

	}

}
