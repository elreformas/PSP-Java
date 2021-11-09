package ejercicio01;

public class TareaRunnable implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 15; i++) {
			
			System.out.println("Soy un hilo runnable y esto es lo que hago");
			
			try {
				Thread.sleep(1000);
			} 
			
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
