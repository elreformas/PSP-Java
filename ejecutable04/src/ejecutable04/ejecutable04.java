package ejecutable04;

import java.io.IOException;

public class ejecutable04 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ProcessBuilder constructor = new ProcessBuilder("bash", "/home/alumno/repos/psp-test/psp-test/retorno.sh", "3");
		Process multi = constructor.start();
		int retorno = multi.waitFor();
		System.out.println(retorno);
		
		String resultado = Integer.toString(retorno);
		constructor = new ProcessBuilder("bash", "/home/alumno/repos/psp-test/psp-test/retorno.sh", resultado);
		Process multi2 = constructor.start();
		int retorno2 = multi2.waitFor();
		System.out.println(retorno2);
		

	}

}
