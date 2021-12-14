package sockets03;

public class Mensajes {
	
	
	String mensaje;
	String origen;
	
	
	public Mensajes(String mensaje, String origen) {
		super();
		this.mensaje = mensaje;
		this.origen = origen;
	}


	@Override
	public String toString() {
		return "Mensajes [mensaje=" + mensaje + ", origen=" + origen + "]";
	}
	
	
	
	

}
