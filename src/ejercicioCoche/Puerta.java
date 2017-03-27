package ejercicioCoche;

public class Puerta {
	private boolean puerta;
	private Ventana ventana;
	
	public void abrirPuerta(){
		puerta=true;
	}
	
	public void cerrarPuerta(){
		puerta=false;
	}
	
	public boolean getPuerta(){
		return puerta;
	}
	
	public boolean getVentana(){
		return ventana.getVentana();
	}

}
