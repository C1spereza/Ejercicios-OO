package ejercicioHerencia;

public class Precio {
	private double precio;
	
	public Precio(){
		precio=0;
	}
	
	public Precio(double precio){
		this.precio=precio;
	}
	
	public void setPrecio(double precio){
		this.precio=precio;
	}
	
	public double getPrecio(){
		return this.precio;
	}

}
