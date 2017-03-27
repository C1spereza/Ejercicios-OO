package ejercicioCoche;

public class Ventana {
	private boolean ventana;
	
	public void abrirVentana(){
		ventana=true;
	}
	
	public void cerrarVentana(){
		ventana=false;
	}
	
	public boolean getVentana(){
		return ventana;
	}

}
