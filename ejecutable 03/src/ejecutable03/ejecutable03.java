package ejecutable03;

import java.io.IOException;

public class ejecutable03 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ProcessBuilder constructor = new ProcessBuilder("firefox");
		
		Process firefox = constructor.start();				
		
		System.out.println(firefox.pid());
		
		Thread.sleep(3000);
		
		if (firefox.isAlive()) {
			
			System.out.println("El proceso sigue en marcha con el PID: " + firefox.pid());
		}
		
		else {
			
			System.out.println("El proceso está muerto");
		}
		
		firefox.destroy();
		
		Thread.sleep(1000);
		if (firefox.isAlive()) {
			
			System.out.println("El proceso sigue en marcha con el PID: " + firefox.pid());
		}
		
		else {
			
			System.out.println("El proceso esta morido");
		}
	}

}
